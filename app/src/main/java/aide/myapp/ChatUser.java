package aide.myapp;
import android.support.v7.app.*;
import android.os.*;
import android.support.v7.widget.Toolbar;
import android.widget.*;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.*;
import java.util.*;
import android.support.design.widget.*;
import android.view.View.*;
import android.view.*;

public class ChatUser extends AppCompatActivity implements View.OnClickListener
{
	RecyclerView recv;
	EditText edtMsg;
	User chatUser;
	User currentUser;
	Toolbar toolbar;
	ChatsAdapter ada;
	String receiver;
	FloatingActionButton fab;
	List<Chats> list=new ArrayList<>();
	
	@Override
	public void onClick(View p1)
	{
		String msg_to_send=edtMsg.getText().toString();
		if (msg_to_send != null && !msg_to_send.isEmpty())
		{
			Chats nc=new Chats(currentUser.getName(), chatUser
							   .getName(), msg_to_send);
			ChatsFragment.chats.add(nc);
			list.add(nc);
			ada.notifyItemInserted(list.size() - 1);
		}
		else
		{
			Toast.makeText(this, "can not send empty message", Toast.LENGTH_SHORT).show();
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chat_user);
		toolbar = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		recv = (RecyclerView)findViewById(R.id.chat_user_rv);
		edtMsg = (EditText)findViewById(R.id.chat_user_edt_msg);
		fab=(FloatingActionButton)findViewById(R.id.fab_send);
		fab.setOnClickListener(this);
		receiver = getIntent().getStringExtra("rn");
		chatUser = new User();
		chatUser.setName(receiver);
		getSupportActionBar().setTitle(chatUser.getName());
		currentUser = new User();
		currentUser.setName("Gaurav Patidar");
		recv.setLayoutManager(new LinearLayoutManager(this));
		initList();
		ada = new ChatsAdapter(list, chatUser.getName(), currentUser.getName());
		recv.setAdapter(ada);
	}
	public void initList()
	{
		list.clear();
		for (Chats c:ChatsFragment.chats)
		{
			if(c.getReceiver().equals(receiver) 
				&& 
			c.getSender().equals(currentUser.getName())
			||
			(c.getSender().equals(receiver)&&
			c.getReceiver().equals(currentUser.getName())))
			
			{
				
				list.add(c);
			}
		}
	}
}
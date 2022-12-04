package aide.myapp;
import android.support.v7.app.*;
import android.os.*;
import android.support.v7.widget.Toolbar;
import android.widget.*;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.*;
import java.util.*;

public class ChatUser extends AppCompatActivity
{
	RecyclerView recv;
	EditText edtMsg;
	User chatUser;
	User currentUser;
	Toolbar toolbar;
	ChatsAdapter ada;
	String receiver;
	List<Chats> list=new ArrayList<>();
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chat_user);
		toolbar = (Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		recv = (RecyclerView)findViewById(R.id.chat_user_rv);
		edtMsg = (EditText)findViewById(R.id.chat_user_edt_msg);
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
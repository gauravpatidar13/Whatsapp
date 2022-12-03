package aide.myapp;
import android.support.v4.app.Fragment;
import android.view.*;
import android.os.*;
import android.support.v7.widget.RecyclerView;
import java.util.*;
import android.support.design.widget.FloatingActionButton;
import android.view.View.*;
import android.widget.*;
import android.support.v7.widget.LinearLayoutManager;
import android.content.*;

public class ChatsFragment extends Fragment implements View.OnClickListener
{   
    RecyclerView rec;
	ChatsAdapter ada;
	FloatingActionButton fab;
	static List<Chats> chats=new ArrayList<>();

	@Override
	public void onClick(View p1)
	{
	
		Intent i=new Intent(getActivity(),ChatUserList.class);
		startActivity(i);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View v=inflater.inflate(R.layout.fragment_chats, container, false);
		rec = v.findViewById(R.id.chats_rv);
		fab = v.findViewById(R.id.fab);
		fab.setOnClickListener(this);
		rec.setLayoutManager(new LinearLayoutManager(getActivity()));
		rec.setHasFixedSize(true);
		initChatList();
		
		return v;
	}
	public void initChatList()
	{
		chats.add(new Chats("Gaurav Patidar", "Harshita Kadotiya", "Hi Harshu"));
		chats.add(new Chats("Kuldeep Patidar", "Gaurav Patidar", "Whats's Bro"));
		chats.add(new Chats("Rohit Patidar", "Gaurav Patidar", "Mandsaur City"));
		chats.add(new Chats("Gaurav Patidar", "Rohit Patidar", "Thank You Very Much"));
		chats.add(new Chats("Gaurav Patidar", "Harshita Kadotiya", "Java Language"));
		chats.add(new Chats("Saurabh Shukla", "Gaurav Patidar", "Java mysirg.com"));
		chats.add(new Chats("Kuldeep Patidar", "Gaurav Patidar", "NIT"));
		chats.add(new Chats("Rohit Patidar", "Gaurav Patidar", "Bamora"));
		chats.add(new Chats("Rohit Patidar", "Gaurav Patidar", "Aide Works"));
		chats.add(new Chats("Harshita Kadotiya", "Gaurav Patidar", "Singing Harshu,Harshu rhythm empire"));
		
	}
}
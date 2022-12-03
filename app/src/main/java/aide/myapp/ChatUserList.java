package aide.myapp;
import android.support.v7.app.*;
import android.os.*;
import android.support.v7.widget.*;
import java.util.*;
import android.view.View.*;
import android.view.*;

public class ChatUserList extends AppCompatActivity
{
	Toolbar toolbar;
	RecyclerView rec;
	UserAdapter adp;
	List<User> users=new ArrayList<>();

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chat_user_list);
		toolbar = (Toolbar)findViewById(R.id.toolbar);
		rec = (RecyclerView)findViewById(R.id.chat_user_list_rv);
		rec.setLayoutManager(new LinearLayoutManager(this));
		initUsers();
		adp = new UserAdapter(users);
		rec.setAdapter(adp);
		setSupportActionBar(toolbar);
	}
	public void initUsers()
	{   users.clear();
		users.add(new User("", "Rohit Patidar"));
		users.add(new User("", "Harshita Kadotiya"));
		users.add(new User("", "JayKishan Soni"));
		users.add(new User("", "Kuldeep Patidar"));
		users.add(new User("", "Saurabh Shukla"));
	}
}
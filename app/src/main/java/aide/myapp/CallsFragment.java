package aide.myapp;
import android.support.v4.app.Fragment;
import android.view.*;
import android.os.*;
import android.support.v7.widget.*;
import java.util.*;

public class CallsFragment extends Fragment
{
RecyclerView rec;
CallsAdapter adapter;
LinearLayoutManager manager;
List<Calls> calls=new ArrayList<>();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View v=inflater.inflate(R.layout.fragment_calls,container,false);
		rec=v.findViewById(R.id.calls_rv);
		manager=new LinearLayoutManager(getActivity());
		rec.setHasFixedSize(true);
		rec.setLayoutManager(manager);
		initCalls();
		adapter=new CallsAdapter(calls);
		rec.setAdapter(adapter);
		return v;
	}
public void initCalls(){
	Calls c;
	c=new Calls();
	c.setCallerName("Rohit Patidar");
	calls.add(c);
	c=new Calls();
	c.setCallerName("Harshita Kadotiya");
	calls.add(c);
	c=new Calls();
	c.setCallerName("Kuldeep Patidar");
	calls.add(c);
	c=new Calls();
	c.setCallerName("JayKishan Soni");
	calls.add(c);
	c=new Calls();
	c.setCallerName("Saurabh Shukla");
	calls.add(c);
}
}
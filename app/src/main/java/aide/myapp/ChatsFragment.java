package aide.myapp;
import android.support.v4.app.Fragment;
import android.view.*;
import android.os.*;

public class ChatsFragment extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View v=inflater.inflate(R.layout.fragment_chats,container,false);
		return v;
	}
	
}
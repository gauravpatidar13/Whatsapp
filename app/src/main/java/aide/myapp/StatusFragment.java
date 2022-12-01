package aide.myapp;
import android.support.v4.app.Fragment;
import android.view.*;
import android.os.*;

public class StatusFragment extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View v=inflater.inflate(R.layout.fragment_status,container,false);
		return v;
	}

}
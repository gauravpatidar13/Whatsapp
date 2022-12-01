package aide.myapp;
import android.support.v7.widget.RecyclerView;
import android.view.*;
import java.util.*;
import android.widget.*;

public class CallsAdapter extends RecyclerView.Adapter<CallsAdapter.CallsVHolder>
{
	List<Calls> calls;

	public CallsAdapter(List<Calls> calls)
	{
		this.calls = calls;
	}
	@Override
	public CallsAdapter.CallsVHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		View v=LayoutInflater.from(p1.getContext()).inflate(R.layout.call_item,p1,false);
		return new CallsVHolder(v);
	}

	@Override
	public void onBindViewHolder(CallsAdapter.CallsVHolder p1, int p2)
	{
		p1.txt.setText(calls.get(p2).getCallerName());
	}

	@Override
	public int getItemCount()
	{
		
		return calls.size();
	}

	class CallsVHolder extends RecyclerView.ViewHolder{
		ImageView img;
		TextView txt;
		public CallsVHolder(View v){
			super(v);
			img=v.findViewById(R.id.call_itemImageView);
			txt=v.findViewById(R.id.call_itemTextView);
		}
	}
}
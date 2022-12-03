package aide.myapp;
import android.support.v7.widget.*;
import android.view.*;
import java.util.*;
import android.widget.*;
import android.view.View.*;
import android.content.*;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserVHolder>
{
	List<User> list;

	public UserAdapter(List<User> list)
	{
		this.list = list;
	}
	@Override
	public UserAdapter.UserVHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		View v=LayoutInflater.from(p1.getContext()).inflate(R.layout.user_item,p1,false);
		return new UserVHolder(v);
	}

	@Override
	public void onBindViewHolder(UserAdapter.UserVHolder p1, int p2)
	{
		p1.txt.setText(list.get(p2).getName());
	}

	@Override
	public int getItemCount()
	{
		return list.size();
	}
	
	class UserVHolder extends RecyclerView.ViewHolder implements View.OnClickListener
	{

		@Override
		public void onClick(View p1)
		{
		String receiver=list.get(getAdapterPosition()).getName();
		Intent i=new Intent(p1.getContext(),ChatUser.class);
		i.putExtra("rn",receiver);
		p1.getContext().startActivity(i);
		}
		
		ImageView img;
		TextView txt;
		public UserVHolder(View v){
			super(v);
			img=v.findViewById(R.id.user_item_image);
			txt=v.findViewById(R.id.user_item_name);
			v.setOnClickListener(this);
		}
		
	}
}
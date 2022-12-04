package aide.myapp;
import android.support.v7.widget.*;
import android.view.*;
import java.util.*;
import android.widget.*;

public class ChatShowLastMessageAdapter extends RecyclerView.Adapter<ChatShowLastMessageAdapter.LastMessageVHolder>
{
	List<ChatLastMessage> lst;

	public ChatShowLastMessageAdapter(List<ChatLastMessage> lst)
	{
		this.lst = lst;
	}
	@Override
	public ChatShowLastMessageAdapter.LastMessageVHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		View v=LayoutInflater.from(p1.getContext()).inflate(R.layout.chat_show_last_message,p1,false);
		return new LastMessageVHolder(v);
	}

	@Override
	public void onBindViewHolder(ChatShowLastMessageAdapter.LastMessageVHolder p1, int p2)
	{
		p1.usernameTxt.setText(lst.get(p2).getSenderName());
		p1.lastmessageTv.setText(lst.get(p2).getLastMessage());
	}

	@Override
	public int getItemCount()
	{
		
		return lst.size();
	}
	
	public class LastMessageVHolder extends RecyclerView.ViewHolder{
	TextView usernameTxt,lastmessageTv;
		public LastMessageVHolder(View v){
		super(v);
		lastmessageTv=v.findViewById(R.id.chat_show_last_message);
		usernameTxt=v.findViewById(R.id.show_last_msg_username);
	}
	}
}
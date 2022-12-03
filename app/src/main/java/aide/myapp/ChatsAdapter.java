package aide.myapp;
import android.support.v7.widget.*;
import android.view.*;
import java.util.*;
import android.widget.*;

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.ChatsVHolder>
{

	List<Chats> chats;
    String receiver,sender;
	public ChatsAdapter(List<Chats> chats,String receiver,String sender)
	{
		this.chats = chats;
		this.receiver=receiver;
		this.sender=sender;
	}
	@Override
	public ChatsAdapter.ChatsVHolder onCreateViewHolder(ViewGroup p1, int p2)
	{
		LayoutInflater inf=LayoutInflater.from(p1.getContext());
		View v=null;
		switch(p2){
			case 0:
				v=inf.inflate(R.layout.chat_right,p1,false);
				break;
			case 1:
				v=inf.inflate(R.layout.chat_left,p1,false);
				break;
		}
		
		return new ChatsVHolder(v);
	}

	@Override
	public void onBindViewHolder(ChatsAdapter.ChatsVHolder p1, int p2)
	{
		p1.tMessage.setText(chats.get(p2).getMessage());
	}

	@Override
	public int getItemCount()
	{
		return chats.size();
	}

	@Override
	public int getItemViewType(int position)
	{
		if(chats.get(position).getSender().equals(sender)){
			return 0;
		}
		
		return 1;
	}
	
	class ChatsVHolder extends RecyclerView.ViewHolder{
		TextView tSender,tReceiver,tMessage;
		public ChatsVHolder(View v){
			super(v);
			tMessage=v.findViewById(R.id.chat_msg);
		}
	}
}
package aide.myapp;

public class Chats
{
	String sender,receiver,message;

	public Chats(String sender, String receiver, String message)
	{
		this.sender = sender;
		this.receiver = receiver;
		this.message = message;
	}
	public Chats()
	{}

	public void setSender(String sender)
	{
		this.sender = sender;
	}

	public String getSender()
	{
		return sender;
	}

	public void setReceiver(String receiver)
	{
		this.receiver = receiver;
	}

	public String getReceiver()
	{
		return receiver;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}
}
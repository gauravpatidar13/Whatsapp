package aide.myapp;

public class ChatLastMessage
{
	String lastMessage,senderName;

	public ChatLastMessage(String lastMessage, String senderName)
	{
		this.lastMessage = lastMessage;
		this.senderName = senderName;
	}
public ChatLastMessage(){}

	public void setLastMessage(String lastMessage)
	{
		this.lastMessage = lastMessage;
	}

	public String getLastMessage()
	{
		return lastMessage;
	}

	public void setSenderName(String senderName)
	{
		this.senderName = senderName;
	}

	public String getSenderName()
	{
		return senderName;
	}}
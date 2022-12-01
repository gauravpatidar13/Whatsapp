package aide.myapp;

public class Calls
{
	String callerName;
	String callerImage;

	public Calls(String callerName, String callerImage)
	{
		this.callerName = callerName;
		this.callerImage = callerImage;
	}
	public Calls(){}

	public void setCallerName(String callerName)
	{
		this.callerName = callerName;
	}

	public String getCallerName()
	{
		return callerName;
	}

	public void setCallerImage(String callerImage)
	{
		this.callerImage = callerImage;
	}

	public String getCallerImage()
	{
		return callerImage;
	}
}
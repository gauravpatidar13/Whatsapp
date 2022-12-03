package aide.myapp;

public class User
{
	String id,name;

	public User(String id, String name)
	{
		this.id = id;
		this.name = name;
	}

public User(){}
	public void setId(String id)
	{
		this.id = id;
	}

	public String getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}}
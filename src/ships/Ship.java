package ships;

public abstract class Ship 
{
	private int length;
	private String name;
	
	Ship(String pName)
	{
		pName = this.name;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

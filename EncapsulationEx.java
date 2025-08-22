package Encapsulation;

class Student1
{
	private String name;
	private int id;
	
	public void  setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	 
}
public class EncapsulationEx 
{
	public static void main(String[] args) 
	{
		Student1 obj = new Student1();
		obj.setName("Ram");
		obj.setId(101);
		
		System.out.println(obj.getName()+" "+obj.getId());
		
		
				
	}

}

public abstract class Animal{
	private int age;
	protected String name;
	
	public Animal(String n)
	{
		name = n;
	}
	
	public void setAge(int i)
	{
		age = i;
	}

	public int getAge()
	{
		return age;
	}

	public boolean isOlderThan(Animal a)
	{
		return a.getAge()> this.age;
	}
}

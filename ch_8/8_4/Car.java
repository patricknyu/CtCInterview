public class Car
{
	private String make;
	private String model;
	private int year;
	public boolean parked;

	public Car(String ma,String mo, int y, boolean p)
	{
		make = ma;
		model = mo;
		year = y;
		parked = p;
	}

	public int getYear()
	{
		return year;
	}
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public void message()
	{
		System.out.println("This is a " + make + model + " from " + year);
	}

}


public class Spot
{
	public boolean hasCar;
	public Car currentCar;

	public Spot(Car c, boolean in)
	{
		currentCar = c;
		hasCar = in;
	}

	public Car getCar()
	{
		return currentCar;
	}
}

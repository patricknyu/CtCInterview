public class ParkingStructure
{
	public int levels;
	public int spotsPerLevel;
	public Car[][] struct;

	public ParkingStructure(int l, int spl)
	{
		struct = new Car[l][spl];
	}
	//returns false if car is there	
	public boolean insertCar(Car c, int level, int spot)
	{
		if(struct[level][spot] == null)
		{
			struct[level][spot] = c;
			c.message();
			return true;
		}
		else
		{
			return false;
		}
	}
}


public class Call
{
	//This decides the minimal rank of the employee.
	private Rank rank;

	//This tells me who is calling
	private Caller caller;

	//This tells me which employee is taking care of the call.
	private Employee handler;

	public Call(Caller c)
	{
		//This just puts the rank as the lowest rank we have.
		rank = Rank.Respondent;
		//Sets the caller as the inputed c
		caller = c;
	}
	
	//Sets handler to imputed employee.
	public void SetHandler(Employee e)
	{
		handler = e;
	}

	//How to talk to the customer
	public void reply(String message)
	{
		System.out.println(message);
	}

	//returns the call's lowest rank
	public Rank getRank()
	{
		return rank;
	}
	
	//changes the rank
	public void setRank(Rank r)
	{
		rank = r;
	}

	public Rank incrementRank()
	{
		if (rank == Rank.Respondent)
		{
			rank = Rank.Manager;
		}
		else if(rank == Rank.Manager)
		{
			rank = Rank.Director;
		}
		return rank;
	}

	//Ends the call
	public void disconnect()
	{
		reply("Bye");
	}
}

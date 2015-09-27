import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//We are going to define this as a singleton class
public class CallHandler
{
	public static CallHandler instance;
	
	//only 3 levels
	private final int LEVELS = 3;

	//Giving 10 respondents, 4 managers, and 2 directors
	private final int NUM_RESPONDENTS = 10;
	private final int NUM_MANAGERS = 4;
	private final int NUM_DIRECTORS = 2;

	List<List<Employee>> employeeLevels;

	List<List<Call>> callQueues;

	protected CallHandler()
	{
		employeeLevels = new ArrayList<List<Employee>>(LEVELS);
		callQueues = new ArrayList<List<Call>>();
	
		//Create 10 respondents
		ArrayList<Employee> respondents = new ArrayList<Employee>(NUM_RESPONDENTS);
		for (int i = 0;i<NUM_RESPONDENTS-1;i++)
		{
			respondents.add(new Respondent());
		}
		employeeLevels.add(respondents);

		//Create 4 managers
		ArrayList<Employee> managers = new ArrayList<Employee>(NUM_MANAGERS);
		for (int i = 0;i<NUM_MANAGERS-1;i++)
		{
			managers.add(new Manager());
		}
		employeeLevels.add(managers);
		
		//Create 2 directors
		ArrayList<Employee> directors = new ArrayList<Employee>(NUM_DIRECTORS);
		for (int i = 0;i<NUM_DIRECTORS-1;i++)
		{
			directors.add(new Director());
		}
		employeeLevels.add(directors);

	}

	//Instance of singleton class
	public static CallHandler getInstance()
	{
		if (instance == null)
		{
			instance = new CallHandler();
		}
		return instance;
	}

	//Gives the first available employee at the lowest level
	public Employee getHandlerForCall(Call call)
	{
		//Goes level by level
		for(int level = call.getRank().getValue(); level < LEVELS-1;level++)
		{
			//List of employees at the current level
			List<Employee> employeeLevel = employeeLevels.get(level);
			//Iterate through employees at this level
			for(Employee e: employeeLevel)
			{
				//Use previously created isFree() method.
				if(e.isFree())
				{
					return e;
				}
			}
		}
		return null;
	}
	//This is in case they input a caller
	public void dispatchCall(Caller caller)
	{
		Call call = new Call(caller);
		dispatchCall(call);
	}

	//dispatchCall will either find a available employee and give them the call or add the call to the queue.
	public void dispatchCall(Call call)
	{
		//From earlier in this program
		Employee e = getHandlerForCall(call);
		if(e != null)
		{
			//written in the employee class.
			e.receiveCall(call);
			//written in the call class.
			call.SetHandler(e);
		}
		else
		{
			call.reply("Waiting Tune -- Probably elevator music");
			//Adds the call the necessary ranked queue.
			callQueues.get(call.getRank().getValue()).add(call);
		}
	}
	
	//We use this if a employee is newly free and we need to reassign them.
	public boolean assignCall(Employee e)
	{
		for(int rank = e.getRank().getValue();rank >=0;rank--)
		{
			//Gets the calls of the current rank
			List<Call> queue = callQueues.get(rank);
			if(queue.size()>0)
			{
				Call call = queue.remove(0);
				if (call != null)
				{
					e.receiveCall(call);
					return true;
				}
			}
		}
		return false;
	}
}

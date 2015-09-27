abstract class Employee
{
	private Call currentCall = null;
	protected Rank rank;

	public Employee()
	{
	}

	public Rank getRank()
	{
		return rank;
	}

	public void receiveCall(Call call)
	{
		currentCall = call;
	}

	public boolean isFree()
	{
		return (currentCall == null);
	}

	public boolean assignNewCall()
	{
		if(isFree())
		{
			return false;
		}
		return CallHandler.getInstance().assignCall(this);
	}

	public void escalateAndResassign()
	{
		if(currentCall !=null)
		{
			currentCall.incrementRank();
			CallHandler.getInstance().dispatchCall(currentCall);

			currentCall = null;
		}
		assignNewCall();
	}

	public void CallCompleted()
	{
		if(currentCall != null)
		{
			currentCall.disconnect();
			currentCall = null;
		}
		assignNewCall();
	}
}

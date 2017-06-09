public class TotalButton extends Button
{
	
	int count;
	
	public void getTotalVoters()
	{
		System.out.println("The Total Number of Voters:");
		for (Candidate candid : CU.map.keySet())
		{
			count += CU.map.get(candid);
		}
		System.out.println(count);
	}
	
	public int getTotal()
	{
		return count;
	}
	
}
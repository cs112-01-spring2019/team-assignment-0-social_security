public class Player
{
	private String name;
	private int wins = 0;
	private int losses = 0;
	private int point = 0;

	public Player(String playername)
	{
		name = playername;
	}

	public void win()
	{
		wins += 1;
	}

	public void losses()
	{
		losses += 1;
	}

	public String getname()
	{
		return name;
	}
	public void setPoints(int z)
	{
		point = z;
	}
	public int getPoints()
	{
		return point;
	}

	public String toString()
	{
		String results = "";
		results = name + " Wins: " + wins + " Losses: " + losses;
		return results;
	}
}
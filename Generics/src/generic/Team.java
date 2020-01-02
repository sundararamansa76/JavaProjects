package generic;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
	private String name;
	int played =0;
	int won =0;
	int tied =0;
	int lost =0;
	List<SockerPlayer> list1 = new ArrayList<SockerPlayer>();

	private ArrayList<T> members = new ArrayList<T>();

	public Team(String name) {
		super();
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean addPlayer (T player)
	{
		if(members.contains(player))
		{
			System.out.println( player.getName() + " is already on this team");
			return false;
		}
		
		else {
			members.add(player);
			System.out.println( player.getName() + "  is picked up");
			return true;
		}
	}
	public int numPlayers()
	{
		return this.members.size();
	}
	
	public void matchResult(Team oppo, int outScore, int thierScore)
	{
		if(outScore > thierScore) {
			won++;
		}
		else if(outScore == thierScore)
		{
			tied++;
		}
		else {
			lost ++;
		}
		played++;
		if(oppo != null) {
			oppo.matchResult(null, thierScore, outScore);
		}
	}
	public int ranking() {
		return (won * 2) + tied;
	}
}

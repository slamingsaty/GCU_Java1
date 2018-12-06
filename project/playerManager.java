package players;
import java.util.*;
import players.Player;

public class playerManager {
	ArrayList <Player>team = new ArrayList<Player>();   //Creating arraylist.
	private String teamName;
	private int teamSize;
	
	public void setTeamSize(ArrayList<?> team) {
		this.teamSize = team.size();
	}
	public int getTeamSize() {
		return this.teamSize;
	}
	
	public void addTeamMember(Player p) {
		team.add(new Player("Sam", "Jameson", "Tigers", "05051987", 31, 60, 33, 6, 230, 2, "Ohio State", "QB"));
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}

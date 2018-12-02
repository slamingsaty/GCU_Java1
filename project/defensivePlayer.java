package players;

public class defensivePlayer extends Player {
	private int tackleTotal;
	private int tackleAssistted;
	private int tackleSolo;
	private int fumblesForced;
	private int fumblesRecovered;
	private int fumbledYardsRecovered;
	private int interceptionsThrown;
	private int interceptionsCaught;
	private int interceptionsYardsReturnedAdverage;
	private int interceptionsLongestReturn;
	private int interceptionsReturnedForTouchDown;
	private int passedDefended;
	private int stuffs;
	private int stuffYards;
	private int sack;

	public String toString() {
		return " tackleTotal: " + tackleTotal + " tackleAssistted: " + tackleAssistted + " tackleSolo: " + tackleSolo
				+ " fumblesForced: " + fumblesForced + " fumblesRecovered: " + fumblesRecovered
				+ " fumbledYardsRecovered: " + fumbledYardsRecovered + " interceptionsCaught: " + interceptionsCaught
				+ " interceptionsYardsReturnedAdverage: " + interceptionsYardsReturnedAdverage
				+ " interceptionsLongestReturn: " + interceptionsLongestReturn + " interceptionsReturnedForTouchDown: "
				+ interceptionsReturnedForTouchDown + " passedDefended: " + passedDefended + " stuffs: " + stuffs
				+ " stuffYards: " + stuffYards + "sack: " + sack;
	}

	public void setTackleTotal(int a) {
		this.tackleTotal = a;
	}

	public int getTackleTotal() {
		return tackleTotal;
	}

	public void setTackleAssistted(int a) {
		this.tackleAssistted = a;
	}

	public int getTackleAssistted() {
		return tackleAssistted;
	}

	public void setTackleSolo(int a) {
		this.tackleSolo = a;
	}

	public int getTackleSolo() {
		return tackleSolo;
	}

	public void setFumblesForced(int a) {
		this.fumblesForced = a;
	}

	public int getFumblesForced() {
		return fumblesForced;
	}

	public void setFumblesRecovered(int a) {
		this.fumblesRecovered = a;
	}

	public int getFumblesRecovered() {
		return fumblesRecovered;
	}

	public void setFumbledYardsRecovered(int a) {
		this.fumbledYardsRecovered = a;
	}

	public int getFumbledYardsRecovered() {
		return fumbledYardsRecovered;
	}

	public void setInterceptionsThrown(int a) {
		this.interceptionsThrown = a;
	}

	public int getInterceptionsThrown() {
		return interceptionsThrown;
	}

	public void setInterceptionsCaught(int a) {
		this.interceptionsCaught = a;
	}

	public int getInterceptionsCaught() {
		return interceptionsCaught;
	}

	public void setInterceptionsYardsReturnedAdverage(int a) {
		this.interceptionsYardsReturnedAdverage = a;
	}

	public int getInterceptionsYardsReturnedAdverage() {
		return interceptionsYardsReturnedAdverage;
	}

	public void setInterceptionsLongestReturn(int a) {
		this.interceptionsLongestReturn = a;
	}

	public int getInterceptionsLongestReturn() {
		return interceptionsLongestReturn;
	}

	public void setInterceptionsReturnedForTouchDown(int a) {
		this.interceptionsReturnedForTouchDown = a;
	}

	public int getInterceptionsReturnedForTouchDown() {
		return interceptionsReturnedForTouchDown;
	}

	public void setPassedDefended(int a) {
		this.passedDefended = a;
	}

	public int getPassedDefended() {
		return passedDefended;
	}

	public void setStuffs(int a) {
		this.stuffs = a;
	}

	public int getStuffs() {
		return stuffs;
	}

	public void setStuffYards(int a) {
		this.stuffYards = a;
	}

	public int getStuffYards() {
		return stuffYards;
	}

	public void setSack(int a) {
		this.sack = a;
	}

	public int getSack() {
		return sack;
	}

	public defensivePlayer() {
		super();
	}

	public defensivePlayer(String firstName, String lastName, String teamName, String DOB, int age, int games,
			int totalTeamGames, int yearsPlayed, float height, int weight, String college, String position,
			int tackleTotal, int tackleAssistted, int tackleSolo, int fumblesForced, int fumblesRecovered,
			int fumbledYardsRecovered, int interceptionsThrown, int interceptionsCaught,
			int interceptionsYardsReturnedAdverage, int interceptionsLongestReturn,
			int interceptionsReturnedForTouchDown, int passedDefended, int stuffs, int stuffYards, int sack) {
		super();
		this.tackleTotal = tackleTotal;
		this.tackleAssistted = tackleAssistted;
		this.tackleSolo = tackleSolo;
		this.fumblesForced = fumblesForced;
		this.fumblesRecovered = fumblesRecovered;
		this.fumbledYardsRecovered = fumbledYardsRecovered;
		this.interceptionsThrown = interceptionsThrown;
		this.interceptionsCaught = interceptionsCaught;
		this.interceptionsYardsReturnedAdverage = interceptionsYardsReturnedAdverage;
		this.interceptionsLongestReturn = interceptionsLongestReturn;
		this.interceptionsReturnedForTouchDown = interceptionsReturnedForTouchDown;
		this.passedDefended = passedDefended;
		this.stuffs = stuffs;
		this.stuffYards = stuffYards;
		this.sack = sack;
	}
}

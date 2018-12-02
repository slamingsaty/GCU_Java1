//created by Samuel Tschappler without any outside help
package players;

public class offensivePlayer extends Player {
	// PASSING
	private int passCompetion;
	private int passAttemps;
	private int passInterceptions;
	private int passCompetionPercent;
	private int passYards;
	private int longestPass;
	// FIELDGOALS
	private int fieldGoalsAttempted;
	private int fieldGoalMissed;
	private int fieldGoalPercent;
	private int fieldGoalYards;
	// RUSHING
	private int rushingAttempts;
	private int rushingYards;
	private int rushingYardsAdverage;
	private int rushingLongest;
	private int rushingTouchDowns;
	private int rushingFirstDowns;
	private int rushingFumbles;
	// RECEIVING
	private int receivingAttempts;
	private int receivingYards;
	private int receivingAdverage;
	private int receivingLongest;
	private int receivingTouchDowns;
	private int receivingFirstDowns;
	private int receivingFumbles;

	public void setPassCompetion(int a) {
		this.passCompetion = a;
	}

	public int passCompetion() {
		return passCompetion;
	}

	public void setAttempts(int a) {
		this.passAttemps = a;
	}

	public int getAttempts() {
		return passAttemps;
	}

	public void setPassInterceptions(int a) {
		this.passInterceptions = a;
	}

	public int getPassInterceptions() {
		return passInterceptions;
	}

	public void setPassCompetionPercent(int passAttemps, int passCompetion) {
		int percent = ((passCompetion / passAttemps) * 100);
		this.passCompetionPercent = percent;
	}

	public int getPassCompetionPercent() {
		return passCompetionPercent;
	}

	public void setPassYards(int a) {
		this.passYards = a;
	}

	public int PassYards() {
		return passYards;
	}

	public void setLongestPass(int a) {
		this.longestPass = a;
	}

	public int getLongestPass() {
		return longestPass;
	}

	public void setFieldGoalsAttempted(int a) {
		this.fieldGoalsAttempted = a;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalMissed(int a) {
		this.fieldGoalMissed = a;
	}

	public int getFieldGoalMissed() {
		return fieldGoalMissed;
	}

	public void setFieldGoalPercent(int fieldGoalsAttempted, int fieldGoalMissed) {
		this.fieldGoalPercent = (((fieldGoalMissed / fieldGoalsAttempted) - 1) * -100);
	}

	public int getFieldGoalPercent() {
		return fieldGoalPercent;
	}

	public void setFieldGoalYards(int a) {
		this.fieldGoalYards = a;
	}

	public int getFieldGoalYards() {
		return fieldGoalYards;
	}

	public void setRushingAttempts(int a) {
		this.rushingAttempts = a;
	}

	public int getRushingAttempts() {
		return rushingAttempts;
	}

	public void setRushingYards(int a) {
		this.rushingYards = a;
	}

	public int getRushingYards() {
		return rushingYards;
	}

	public void setRushingYardsAdverage(int rushingYards, int games) {
		this.rushingYardsAdverage = rushingYards / games;
	}

	public int getRushingYardsAdverage() {
		return rushingYardsAdverage;
	}

	public void setRushingLongest(int a) {
		this.rushingLongest = a;
	}

	public int getRushingLongest() {
		return rushingLongest;
	}

	public void setRushingTouchDowns(int a) {
		this.rushingTouchDowns = a;
	}

	public int getRushingTouchDowns() {
		return rushingTouchDowns;
	}

	public void setRushingFirstDowns(int a) {
		this.rushingFirstDowns = a;
	}

	public int getRushingFirstDowns() {
		return rushingFirstDowns;
	}

	public void setRushingFumbles(int a) {
		this.rushingFumbles = a;
	}

	public int getRushingFumbles() {
		return rushingFumbles;
	}

	public void setReceivingAttempts(int a) {
		this.receivingAttempts = a;
	}

	public int getReceivingAttempts() {
		return receivingAttempts;
	}

	public void setReceivingYards(int a) {
		this.receivingYards = a;
	}

	public int getReceivingYards() {
		return receivingYards;
	}

	public void setReceivingAdverage(int receivingYards, int receivingAttempts) {
		this.receivingAdverage = receivingYards / receivingAttempts;
	}

	public int getReceivingAdverage() {
		return receivingAdverage;
	}

	public void setReceivingLongest(int a) {
		this.receivingLongest = a;
	}

	public int getReceivingLongest() {
		return receivingLongest;
	}

	public void setReceivingTouchDowns(int a) {
		this.receivingTouchDowns = a;
	}

	public int getReceivingTouchDowns() {
		return receivingTouchDowns;
	}

	public void setReceivingFirstDowns(int a) {
		this.receivingFirstDowns = a;
	}

	public int getReceivingFirstDowns() {
		return receivingFirstDowns;
	}

	public void setReceivingFumbles(int a) {
		this.receivingFumbles = a;
	}

	public int getReceivingFumbles() {
		return receivingFumbles;
	}

	public String toString() {
		return "passCompetion: " + passCompetion + "passAttemps: " + passAttemps + "passCompetionPercent: "
				+ passCompetionPercent + "passYards: " + passYards + "longestPass: " + longestPass
				+ "passInterceptions: " + passInterceptions + "fieldGoalsAttempted: " + fieldGoalsAttempted
				+ "fieldGoalMissed: " + fieldGoalMissed + "fieldGoalYards: " + fieldGoalYards + "rushingAttempts: "
				+ rushingAttempts + "rushingYards: " + rushingYards + "rushingAdverage: " + rushingYardsAdverage
				+ "rushingLongest: " + rushingLongest + "rushingTouchDowns: " + rushingTouchDowns
				+ "rushingFirstDowns: " + rushingFirstDowns + "rushingFumbles: " + rushingFumbles
				+ "receivingAttempts: " + receivingAttempts + "receivingYards: " + receivingYards
				+ "receivingAdverage: " + receivingAdverage + "receivingLongest: " + receivingLongest
				+ "receivingTouchDowns: " + receivingTouchDowns + "receivingFirstDowns: " + receivingFirstDowns
				+ "receivingFumbles: " + receivingFumbles;
	}

	public offensivePlayer() {
		super();
	}

	public offensivePlayer(String firstName, String lastName, String teamName, String DOB, int age, int games,
			int totalTeamGames, int yearsPlayed, float height, int weight, String college, String position,
			int passCompetion, int passAttemps, int passInterceptions, int passCompetionPercent, int passYards,
			int longestPass, int fieldGoalsAttempted, int fieldGoalMissed, int fieldGoalPercent, int fieldGoalYards,
			int rushingAttempts, int rushingYards, int rushingYardsAdverage, int rushingLongest, int rushingTouchDowns,
			int rushingFirstDowns, int rushingFumbles, int receivingAttempts, int receivingYards, int receivingAdverage,
			int receivingLongest, int receivingTouchDowns, int receivingFirstDowns, int receivingFumbles) {
		super();
		this.passCompetion = passCompetion;
		this.passAttemps = passAttemps;
		this.passInterceptions = passInterceptions;
		this.passCompetionPercent = passCompetionPercent;
		this.passYards = passYards;
		this.longestPass = longestPass;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.fieldGoalMissed = fieldGoalMissed;
		this.fieldGoalPercent = fieldGoalPercent;
		this.fieldGoalYards = fieldGoalYards;
		this.rushingAttempts = rushingAttempts;
		this.rushingYards = rushingYards;
		this.rushingYardsAdverage = rushingYardsAdverage;
		this.rushingLongest = rushingLongest;
		this.rushingTouchDowns = rushingTouchDowns;
		this.rushingFirstDowns = rushingFirstDowns;
		this.rushingFumbles = rushingFumbles;
		this.receivingAttempts = receivingAttempts;
		this.receivingYards = receivingYards;
		this.receivingAdverage = receivingAdverage;
		this.receivingLongest = receivingLongest;
		this.receivingTouchDowns = receivingTouchDowns;
		this.receivingFirstDowns = receivingFirstDowns;
		this.receivingFumbles = receivingFumbles;
		setPassCompetionPercent(passAttemps, passCompetion);
		setFieldGoalPercent(fieldGoalsAttempted, fieldGoalMissed);
		setRushingYardsAdverage(rushingAttempts, games);
		setReceivingAdverage(receivingYards, receivingAttempts);
	}
}

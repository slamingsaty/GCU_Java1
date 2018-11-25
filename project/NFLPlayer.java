//created 2018-11-19 by Samuel Tschappler without any outside help

public class NFLPlayer {
	private String firstName;
	private String lastName;
	private String teamName;
	private int dateOfBirth;
	private int age;
	private int games;
	private int totalTeamGames;
	private int yearsPlayed;
	private int adverageGamesYearly;
	private int adverageGamesMissed;
	private double height;
	private int weight;
	private String college;
	private String position;

	public void setFirstName(String a) {
		firstName = a;
	}

	public void setLastName(String a) {
		lastName = a;
	}

	public void setDateOfBirth(int a) {
		dateOfBirth = a;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setGames(int a) {
		games = a;
	}

	public void setHeight(double a) {
		height = a;
	}

	public void setWeight(int a) {
		weight = a;
	}

	public void setCollege(String a) {
		college = a;
	}

	public void setPosition(String a) {
		position = a;
	}

	public void setYearsPlayed(int years) {
		yearsPlayed = years;
	}

	public void setAdverageGamesYearly(int years, int totalGames) {
		adverageGamesYearly = (totalGames / years);
	}

	public void setAdverageGamesMissed(int years, int totalTeamGames, int totalGamesPlayed) {
		adverageGamesMissed = ((totalTeamGames - totalGamesPlayed) / years);
	}

	public String getTeamName() {
		return teamName;
	}

	public String getFirstName() {
		return firstName;

	}

	public String getLastName() {
		return lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public int getGames() {
		return games;
	}

	public double getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getCollege() {
		return college;
	}

	public String getPosition() {
		return position;
	}

	public int getYearsPlayed() {
		return yearsPlayed;
	}

	public int getAdverageGamesYearly() {
		return adverageGamesYearly;
	}

	public int getAdverageGamesMissed() {
		return adverageGamesMissed;
	}

	public static void main(String[] args) {
//		Tests both constructors.
//		NFLPlayer paramedPlayer = NFLPlayer("Sam", "Smith", "Seattle Seahawks", 20180801, 1,
//											0, 0, 0, 0, 6, 315, "Ohio State", "Quarterback");
		NFLPlayer paramedPlayer = new NFLPlayer();
		int games = paramedPlayer.getAdverageGamesYearly();
		System.out.println("if this char: (" + games + ") is 0 then the default palyer built corrently");
//			Tests a good sampling of getter and setter methods.
//			Comments well documented.
	}

	public NFLPlayer() {

		firstName = "Sam";
		lastName = "Smith";
		teamName = "Seattle Seahawks";
		dateOfBirth = 20180801;
		age = 1;
		games = 0;
		totalTeamGames = 0;
		yearsPlayed = 1;
		adverageGamesYearly = 0;
		height = 6;
		weight = 315;
		college = "Ohio State";
		position = "Quarterback";
		setAdverageGamesYearly(yearsPlayed, games);
		setAdverageGamesMissed(yearsPlayed, totalTeamGames, games);
	}

	public NFLPlayer(String firstName, String lastName, String teamName, int age, int games, int totalTeamGames,
			int yearsPlayed, float height, int weight, String college, String position) {
		setAdverageGamesYearly(yearsPlayed, games);
		setAdverageGamesMissed(yearsPlayed, totalTeamGames, games);
	}

	public String toString() {
		return "Name: " + firstName + lastName + " dateOfBirth: " + dateOfBirth + " age: " + age + " games: " + games
				+ " height: " + height + " weight: " + weight + " college2: " + college + " position: " + position
				+ " Team: ";
	}

}

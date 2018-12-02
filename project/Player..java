package players;

public class Player {
	public String firstName;
	public String lastName;
	private String teamName;
	private String dateOfBirth;
	private int age;
	public int games;
	private double height;
	private int weight;
	public int totalTeamGames;
	public int yearsPlayed;
	public int adverageGamesYearly;
	public int adverageGamesMissed;
	private String college;
	private String position;

	public void setFirstName(String a) {
		this.firstName = a;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String a) {
		this.lastName = a;
	}
	public String getLastName() {
		return lastName;
	}

	public void setDateOfBirth(String a) {
		this.dateOfBirth = a;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setAge(int a) {
		this.age = a;
	}
	public int getAge() {
		return age;
	}

	public void setGames(int a) {
		this.games = a;
	}
	public int getGames() {
		return games;
	}
	
	public void setTotalTeamGames(int a) {
		this.totalTeamGames = a;
	}
	public int getTotalTeamGames() {
		return totalTeamGames;
	}

	public void setHeight(double a) {
		this.height = a;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWeight(int a) {
		this.weight = a;
	}
	public int getWeight() {
		return weight;
	}

	public void setCollege(String a) {
		this.college = a;
	}
	public String getCollege() {
		return college;
	}

	public void setPosition(String a) {
		this.position = a;
	}
	public String getPosition() {
		return position;
	}

	public void setYearsPlayed(int years) {
		this.yearsPlayed = years;
	}
	public int getYearsPlayed() {
		return yearsPlayed;
	}
	
	public void setTeamName(int teamName) {
		this.yearsPlayed = teamName;
	}
	public String getTeamName() {
		return teamName;
	}

	public void setAdverageGamesYearly(int years, int totalGames) {
		this.adverageGamesYearly = (totalGames / years);
	}
	public int getAdverageGamesYearly() {
		return adverageGamesYearly;
	}

	public void setAdverageGamesMissed(int years, int totalTeamGames, int totalGamesPlayed) {
		this.adverageGamesMissed = ((totalTeamGames - totalGamesPlayed) / years);
	}
	public int getAdverageGamesMissed() {
		return adverageGamesMissed;
	}

	public static void main(String[] args) {
//		Tests both constructors.
//		NFLPlayer paramedPlayer = NFLPlayer("Sam", "Smith", "Seattle Seahawks", 20180801, 1,
//											0, 0, 0, 0, 6, 315, "Ohio State", "Quarterback");
		Player paramedPlayer = new Player();
		int games = paramedPlayer.getAdverageGamesYearly();
		System.out.println("if this char: (" + games + ") is 0 then the default palyer built corrently");
//			Tests a good sampling of getter and setter methods.
//			Comments well documented.
	}

	public Player() {
		super();
	}

	public Player(String firstName, String lastName, String teamName, String DOB, int age, int games, int totalTeamGames,
			int yearsPlayed, float height, int weight, String college, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.teamName = teamName;
		this.dateOfBirth = DOB;
		this.age = age;
		this.games = games;
		this.totalTeamGames = totalTeamGames;
		this.yearsPlayed = yearsPlayed;
		this.height = height;
		this.weight = weight;
		this.college = college;
		this.position = position;
		setAdverageGamesYearly(yearsPlayed, games);
		setAdverageGamesMissed(yearsPlayed, totalTeamGames, games);
	}

	public String toString() {
		return "Name: " + firstName + lastName + " dateOfBirth: " + dateOfBirth + " age: " + age + " games: " + games
				+ " height: " + height + " weight: " + weight + " college: " + college + " position: " + position
				+ " Team: ";
	}
	public void testPlayerDriverMethod() {
		Player testPlayer = new Player();
		testPlayer.setAge(23);
		testPlayer.setFirstName("James");
		testPlayer.setLastName("Smith");
		Player secondTestPlayer = new Player("Sam", "Jameson", "Tigers", "05051987", 31, 60, 33, 6, 230, 2, "Ohio State", "QB");
		System.out.println(secondTestPlayer.getAge());
	}
}


public class playerTest {
	public static void main(String[] args) {

		NFLPlayer no1Player = new NFLPlayer();

		no1Player.setLastName("testlastname");
		System.out.println("Last name should be testlastname: " + no1Player.getLastName());

		no1Player.setDateOfBirth(19000101);
		System.out.println("date of birth should be 19000101: " + no1Player.getDateOfBirth());

		no1Player.setAge(100);
		System.out.println("Age should be 100: " + no1Player.getAge());

		no1Player.setGames(100);
		System.out.println("Games should be 100: " + no1Player.getGames());

		no1Player.setHeight(6.25);
		System.out.println("Height should be 6.25: " + no1Player.getHeight());

		no1Player.setWeight(300);
		System.out.println("Weight should be 300: " + no1Player.getWeight());

		no1Player.setCollege("Seattle");
		System.out.println("College should be Seattle: " + no1Player.getCollege());

		no1Player.setPosition("QB");
		System.out.println("Position should be QB: " + no1Player.getPosition());

		no1Player.setYearsPlayed(100);
		System.out.println("Years Played should be 100: " + no1Player.getYearsPlayed());

		no1Player.setAdverageGamesYearly(100, 10000);
		System.out.println("Adverage Games Yearly should be 100: " + no1Player.getAdverageGamesYearly());

		no1Player.setAdverageGamesMissed(100, 10000, 5000);
		System.out.println("Adverage Games Missed should be 50: " + no1Player.getAdverageGamesMissed());
	}
}

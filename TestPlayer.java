public class TestPlayer
{
	public static void main(String[] args)
	{
		int points;
		Player player1 = new Player("Natasha");
		Player player2 = new Player("Josh");
		player1.win();
		System.out.println(player1);
		player2.losses();
		System.out.println(player2);
		player1.setPoints(7);
		points = player1.getPoints();
		System.out.println(points);
	}
}
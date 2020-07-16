import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner reader = new Scanner(System.in);
	private static char sign;
	public static void main(String[] args) {
		Player player1 = new Player(isName(1));
		Player player2 = new Player(isName(2));
		GuessNumber test = new GuessNumber(player1, player2);
		System.out.println("Player1 name is " + player1.getName());
		System.out.println("Player2 name is " + player2.getName());

		do {
			test.startGame();
		} while (willNext());
	}
		private static String isName(int num) {
			System.out.println("player " + num + ", what's u name: ");
			String name = reader.next();
			return name;
		}

		private static boolean willNext() {
		do {
			System.out.println("Do u wanna continue?: Y or N");
			sign = reader.next().charAt(0);
			if (sign == 'Y') 
				return true;
			else if (sign != 'N') System.out.println("Only Y or N"); 
		} while (sign != 'N');
		return false;
		}
}
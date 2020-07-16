import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner reader = new Scanner(System.in);
	private static char continue1;
	public static void main(String[] args) {
		Player player1 = new Player(inputName(1));
		Player player2 = new Player(inputName(2));
		GuessNumber game = new GuessNumber(player1, player2);
		System.out.println("Player1 name is " + player1.getName());
		System.out.println("Player2 name is " + player2.getName());

		do {
			game.startGame();
		} while (isNext());
	}

		private static String inputName(int num) {
			System.out.println("player " + num + ", what's u name: ");
			return reader.next();
		}

		private static boolean isNext() {
		do {
			System.out.println("Do u wanna continue?: Y or N");
			continue1 = reader.next().charAt(0);
			if (continue1 == 'Y') {
		return true;
			} else { if (continue1 != 'N') System.out.println("Only Y or N"); 
			}
		} while (continue1 != 'N');
		return false;
		}
}
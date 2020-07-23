import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("player1, what's u name: ");
		Player player1 = new Player(reader.next());
		System.out.println("player2, what's u name: ");
		Player player2 = new Player(reader.next());
		GuessNumber game = new GuessNumber(player1, player2);

		do {
			game.startGame();
		} while (isNext());
	}

	private static boolean isNext() {
	char exit;
		do {
			System.out.println("Do u wanna continue?: Y or N");
			exit = reader.next().charAt(0);
			if (exit == 'Y') {
				return true;
			} else { if (exit != 'N') System.out.println("Only Y or N"); 
			}
		} while (exit != 'N');
	return false;
	}
}
import java.util.Scanner;

public class GuessNumberTest {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char exit; 
		System.out.println("Hello, player1, what's u name: ");
		Player player1 = new Player(reader.next());
		System.out.println("Hello, player2, what's u name: ");
		Player player2 = new Player(reader.next());
		GuessNumber game = new GuessNumber(player1, player2);

		do {
			game.startGame();
			do {
				System.out.println("Do u wanna continue?: Y or N");
				exit = reader.next().charAt(0);
			} while((exit != 'Y') && (exit != 'N'));
		} while (exit != 'N');
	}
}
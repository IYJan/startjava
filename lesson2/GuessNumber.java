import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player player1;
	private Player player2;
	private static Scanner reader = new Scanner(System.in);
	
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void startGame() {
		randomNumber = (int) (Math.random() * 101);
		System.out.println("randomNumber = " + randomNumber);
		while (true) {
			if (inputNums(player1)) {
				break;
			}
			if (inputNums(player2)) {
				return;
			}
			break;
		}
	}

	private boolean inputNums(Player player) {
		System.out.println(player.getName() + " please, enter u number = ");
		player.setNumber(reader.nextInt());
		if (player.getNumber() > randomNumber) {
			System.out.println(player.getName() + " u number > computer number \n");
		} else if (player.getNumber() < randomNumber) {
			System.out.println(player.getName() + " u number < computer number \n");
		} else {
			System.out.println(player.getName() + " u are win ");
			return true;
		}
		return false;
	}
}
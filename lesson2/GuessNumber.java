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
		enterNum();
		while (true) {
			if (isWin(player1)) {
				System.out.println("player1 win ");
				break;
			}
			if (isWin(player2)) {
				System.out.println("player2 win ");
				return;
			}
			System.out.println("Nobody Win");
			break;
		}
	}

	private void enterNum() {
		do {
			System.out.println(player1.getName() + " please, enter u number= ");
			int num = reader.nextInt();
			player1.setNumber(num);

		do {
			System.out.println(player2.getName() + " please, enter u number= ");
			num = reader.nextInt();
			player2.setNumber(num);
			if (player1.getNumber() == player2.getNumber()) {
				System.out.println(" Your numbers are equality, " + "\n" + 
				player1.getName() + " = " + player1.getNumber() +"\n" + 
				player2.getName() + " = "+ player2.getNumber() + "\n" + 
				player2.getName() + " u need change the number ");
			} else break;
		} while(true);
		} while (false);
	}

	private boolean isWin(Player player) {
/*		System.out.println("Begin win method");
			System.out.println("Player" + player.getName() + player.getNumber() + " Begin Search");*/
		if (player.getNumber() > randomNumber) {
			System.out.println(player.getName() + " u number > that the computer number ");
		} else if (player.getNumber() < randomNumber) {
			System.out.println(player.getName() + " u number < that the computer number ");
		} else {
			System.out.println(player.getName() + " u are win ");
			return true;
		}
		return false;
	}
}
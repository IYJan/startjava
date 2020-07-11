import java.util.Scanner;

public class GuesNumber {
		private int randomNumber;
		private Player player1;
		private Player player2;
		Scanner reader = new Scanner(System.in);
		
		public GuesNumber(Player player1, Player player2) {
			this.player1 = player1;
			this.player2 = player2;
		}
		
		public void startPlay() {
			randomNumber = (int) (Math.random()*101);
			System.out.println("randomNumber= " + randomNumber);
/*			System.out.println("Player1= " + player1.getName());
			System.out.println("Player2= " + player2.getName());*/
			numbPlayer();
			while (true) {
				if (win(player1)) {
					System.out.println("player1 win ");
					break;
				}
				if (win(player2)) {
					System.out.println("player2 win ");
					return;
				}
				System.out.println("Nobody Win");
				break;
			}
		}

		public boolean win(Player player) {
/*			System.out.println("Begin win method");
			System.out.println("Player" + player.getName() + player.getCount() + " Begin Search");*/
			if (player.getCount() > randomNumber) 
			System.out.println(player.getName() + " u number > that the computer number ");
			else if (player.getCount() < randomNumber) 
				System.out.println(player.getName() + " u number < that the computer number ");
			else {
				System.out.println(player.getName() + " u are win ");
				return true;
			}
			return false;
			}

		public void numbPlayer() {
			do {
				System.out.println(player1.getName() + " Please, enter u number= ");
				int num = reader.nextInt();
				player1.setCount(num);

				do {
					System.out.println(player2.getName() + "Please, enter u number= ");
					num = reader.nextInt();
					player2.setCount(num);
					if (player1.getCount() == player2.getCount()) {
						System.out.println(" Your numbers are equality, " + "\n" + 
								player1.getName() + " = " + player1.getCount() +"\n" + 
								player2.getName() + " = "+ player2.getCount() + "\n" + 
								player2.getName() + " u need change the number ");
					} else break;
				} while(true);	
			} while (false);
		}
}

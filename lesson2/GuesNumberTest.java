import java.util.Scanner;

public class GuesNumberTest {
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random()*101);
		Person player1 = new Person();
		Person player2 = new Person();
		Scanner reader = new Scanner(System.in);
		char sign;
		System.out.println("1-st number for random" + randomNumber);
		System.out.println("Input Player1, what's u name= ");
		String name = reader.next();
		player1.setName(name);
		System.out.println("Input Player2, what's u name= ");
		name = reader.next();
		player2.setName(name);
		
		do {
			System.out.println(player1.getName() + " what's u number= ");
			int num = reader.nextInt();
			player1.setCount(num);
			do {
			System.out.println(player2.getName() + " what's u number= ");
			num = reader.nextInt();
			player2.setCount(num);
			if (player1.getCount() == player2.getCount()) {
				System.out.println(" Your numbers are equality, " + "\n" + 
								player1.getName() + " = " + player1.getCount() +"\n" + 
								player2.getName() + " = "+ player2.getCount() + "\n" + 
								player2.getName() + " u need change the number ");
			}else break;
			}while(true);	
			if (randomNumber == player1.getCount()) {
				System.out.println(player1.getName() + ": U are WIN " + player1.getCount());
			} else {
				System.out.println(player1.getName() + ": U are Wrong ");		
				if (randomNumber == player2.getCount()) {
				System.out.println(player2.getName() + ": U are WIN " + player2.getCount());		
			} else {
				System.out.println(player2.getName() + ": U are Wrong ");		
			}
			}
			while(true) {
			System.out.println("Do u wanna continue?: Y or N");
			sign = reader.next().charAt(0);
			if (sign == 'Y' || sign == 'N') break;
				else System.out.println("Only Y or N");
			}
		} while (sign == 'Y');
	}
}
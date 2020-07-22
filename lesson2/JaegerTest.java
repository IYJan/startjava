import java.util.Scanner;

public class JaegerTest {
	private static Scanner reader = new Scanner(System.in);
	private static char sign;
	private static Jaeger jag1;
	private static Jaeger jag2;
	
	public static void main(String[] args) {
		jag2 = new Jaeger("Robot0", "01/01/20000", "Mark-2", "Knife", "Laser60", 10, 2.4, 200f);
		jag1 = new Jaeger("Robot1", "11/11/1999", "Mark-1", "Fire", "Laser10", 80, 2.2, 220f);
		jag2.setNickName("Robot2");
		jag2.setLaunch("10/11/2222");
		jag2.setMarkName("Mark-5");
		jag2.setArm1("Gatling");
		jag2.setArm2("Bombard");
		jag2.setKaijiKills(100);
		jag2.setWeightTonn(3.2);
		jag2.setHeight(200f);
		int count;
		float countF;
		double countD;
		
		do {
			System.out.println("Do u wanna activate special jaeger for urself.parametrs? Y or N");
			sign = reader.next().charAt(0);
			if ( sign == 'Y') {
				activateJaeger(jag2);
				break;
			} else if (sign != 'N') System.out.println("Only Y or N"); 
		} while (sign != 'N');
		System.out.println("Jaeger1: Name is \t" + jag1.getNickName() + "\n"+
						    "Date launch is \t\t" + jag1.getLaunch() + "\n"+
							"Armor1 is \t\t" + jag1.getArm1() + "\n"+
							"Armor2 is \t\t" + jag1.getArm2() + "\n"+
							"How many kills kaiji is " + jag1.getKaijiKills());
		System.out.println();
		System.out.println("Jaeger2: Name is \t" + jag2.getNickName() + "\n"+
						    "Date launch is \t\t" + jag2.getLaunch() + "\n"+
							"Armor1 is \t\t" + jag2.getArm1() + "\n"+
							"Armor2 is \t\t" + jag2.getArm2() + "\n"+
							"How many kills kaiji is " + jag2.getKaijiKills());
		jag1.setArm1("Rifle");
		System.out.println("We changed Jaeger1 Armor1, now is " + jag1.getArm1());
	}

	private static void activateJaeger(Jaeger jaeger) {
		System.out.println("Input NickName:");
		jaeger.setNickName(reader.next());
		System.out.println("Input Launch: day/month/year");
		jaeger.setLaunch(reader.next());
		System.out.println("Input MarkName:");
		jaeger.setMarkName(reader.next());
		System.out.println("Input Armor1:");
		jaeger.setArm1(reader.next());
		System.out.println("Input Armor2:");
		jaeger.setArm2(reader.next());
		System.out.println("Input Kills:");
		jaeger.setKaijiKills(reader.nextInt());
		System.out.println("Input Weight:");
		jaeger.setWeightTonn(reader.nextDouble());
		System.out.println("Input Height:");
		jaeger.setHeight(reader.nextFloat());
	}
}
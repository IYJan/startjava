import java.util.Scanner;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jag1 = new Jaeger();
		Jaeger jag2 = new Jaeger();
		//Jaeger jag2 = new Jaeger("Robot2", "10/11/2222", "Mark-5", "Gutling", "Laser100", 100, 3.2 ,200f );
		String name;
		jag2.setNickName("Robot2");
		jag2.setLaunch("10/11/2222");
		jag2.setMarkName("Mark-5");
		jag2.setArm1("Gatling");
		jag2.setArm2("Bombard");
		jag2.setKills(100);
		jag2.setWeight(3.2);
		jag2.setHeight(200f);
		int count;
		float countF;
		Double countD;
		Scanner reader = new Scanner(System.in);
		//System.out.println("Jag1 Arm1: = " + jag1.getArm1() + "\n" + 
		//	                "Height: = " + jag1.getHeight());

		while (true) {
			System.out.println("U can activate special jaeger for urself.parametrs");
			System.out.println("Input NickName:");
			name = reader.next();
			jag1.setNickName(name);
			System.out.println("Input Launch: day/month/year");
			name = reader.next();
			jag1.setLaunch(name);
			System.out.println("Input MarkName:");
			name = reader.next();
			jag1.setMarkName(name);
			System.out.println("Input Armor1:");
			name = reader.next();
			jag1.setArm1(name);
			System.out.println("Input Armor2:");
			name = reader.next();
			jag1.setArm2(name);
			System.out.println("Input Kills:");
			count = reader.nextInt();
			jag1.setKills(count);
			System.out.println("Input Weight:");
			countD = reader.nextDouble();
			jag1.setWeight(countD);
			System.out.println("Input Height:");
			countF = reader.nextFloat();
			jag1.setHeight(countF);
			break;
		}
		System.out.println("Jaeger: Name is          " + jag1.getNickName() + "\n"+
						    "Date launch is          " + jag1.getLaunch() + "\n"+
							"Armor1 is               " + jag1.getArm1() + "\n"+
							"Armor2 is               " + jag1.getArm2() + "\n"+
							"How many kills kaiji is " + jag1.getKills());
		System.out.println();
		System.out.println("Jaeger2: Name is         " + jag2.getNickName() + "\n"+
						    "Date launch is          " + jag2.getLaunch() + "\n"+
							"Armor1 is               " + jag2.getArm1() + "\n"+
							"Armor2 is               " + jag2.getArm2() + "\n"+
							"How many kills kaiji is " + jag2.getKills());
		jag1.setArm1("Rifle");
		System.out.println("We changed Jaeger2 Armor1, now is " + jag1.getArm1());
	}
}
public class MyFirstGame {

		public boolean eql;

	public static void main (String[] args) {

		long rangeBegin = 0L;

		long rangeEnd = 100L;

		long currentTime = System.currentTimeMillis();

		long randomNumber = rangeBegin + currentTime % (rangeEnd - rangeBegin);
	
	

		System.out.println("chislo 1-st random" + randomNumber);
		
		do {
				long currentTime2 = System.currentTimeMillis();

				long humNumb = rangeBegin + currentTime2 % (rangeEnd - rangeBegin);

				System.out.println("chislo 2st random" + humNumb);

			if (randomNumber != humNumb) {
				
					eql = false;
				}

			if (randomNumber == humNumb){
				System.out.println("Confirmed equality for 2 numbers");		
				eql = true;

			} else {

				if (randomNumber > humNumb){

					System.out.println("randomNumber > then human num.");		
				} else {
					System.out.println("randomNumber < then human num.");		
						}
					} 
			} while (eql == false);
}}


package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static boolean eql;
	public static void main(String[] args) {
		long rangeBegin = 0L;
		long rangeEnd = 100L;
		long currentTime = System.currentTimeMillis();
		long randomNumber = rangeBegin + currentTime % (rangeEnd - rangeBegin);
		System.out.println("1-st number for random" + randomNumber);
		do {
			long currentTime2 = System.currentTimeMillis();
			long humNumb = rangeBegin + currentTime2 % (rangeEnd - rangeBegin);
			System.out.println("2-nd num. for random" + humNumb);
				if (randomNumber != humNumb) {
					eql = false;
				}
				if (randomNumber == humNumb){
					System.out.println("Confirmed equality for 2 numbers; " + "\n" + 
										" 1-st number for random = " + randomNumber);		
					break;
					//eql = true;
				} else if (randomNumber > humNumb){
					System.out.println("randomNumber > then human num.");		
				} else {
					System.out.println("randomNumber < then human num.");		
				}
		} while (true);
	}
}
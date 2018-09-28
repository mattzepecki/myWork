package mathOperators;

import java.util.Scanner;
public class speeding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mphOver=-999;
		int price =-999;
		int speedLimit=-999;
		int speed=-999;
		Scanner input=new Scanner(System.in);
		System.out.println("What is the speed limit");
		speedLimit= input.nextInt();
		System.out.println("How fast were you going");
		speed= input.nextInt();
		mphOver= speed-speedLimit;
		price=mphOver*40;
		System.out.println("Your ticket is " + price + " dollars");
	}

}

package mathOperators;

import java.util.Scanner;
public class wallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length=-999.0;
		double height=-999.0;
		double area=-999.0;
		Scanner input=new Scanner(System.in);
		System.out.println("What is the height of the wall");
		height= input.nextDouble();
		System.out.println("What is the length of the wall");
		length=input.nextDouble();
		area= height* length;
		System.out.println("The area of the wall is " + area + " feet");

	}

}

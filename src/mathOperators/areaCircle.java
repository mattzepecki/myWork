package mathOperators;

import java.util.Scanner;
public class areaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius=-999.0;
		double pi=-999.0;
		double area=-999.0;
		Scanner input=new Scanner(System.in);
		System.out.println("What is the radius of the circle");
		radius= input.nextDouble();
		pi=3.14;
		area= radius*radius*pi;
		System.out.println("The area of the circle is " + area);

	}

}

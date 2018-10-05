package mathOperators;

import java.util.Scanner;
public class longDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=-999;
		int number2=-999;
		int remainder=-999;
		int answer=-999;
		Scanner input=new Scanner(System.in);
		System.out.println("What is the first intger");
		number1= input.nextInt();
		System.out.println("What is the second number");
		number2= input.nextInt();
		answer=number1/number2;
		remainder= number1%number2;
		System.out.println(answer+ "r"+remainder);
		

	}

}

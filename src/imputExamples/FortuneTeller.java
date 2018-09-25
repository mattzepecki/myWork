package imputExamples;

import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double weight=-999.0;
int age=120;
int luckynumber=999;
Scanner input=new Scanner(System.in);
System.out.println("What is your weight?");
weight=input.nextDouble();
System.out.println("What is your age?");
age=input.nextInt();
System.out.println("What is your lucky number?");
luckynumber=input.nextInt();
System.out.println("In the future");
System.out.println("I See....");
System.out.println( luckynumber + " years from now.... ");
System.out.println("You will be resident number" + age + weight + " at the old folks home");
input.close();

	}

}

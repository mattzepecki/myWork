package imputExamples;

import java.util.Scanner;

public class AgeWeight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double weight=-999.0;
int age=120;
Scanner input=new Scanner(System.in);
System.out.println("What is your weight?");
weight=input.nextInt();
System.out.println("What is your age");
age=input.nextInt();
System.out.println("You are " + weight + " pounds and " + age + " years old");
input.close();
	}

}
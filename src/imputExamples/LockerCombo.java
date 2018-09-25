package imputExamples;

import java.util.Scanner;

public class LockerCombo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Number1 =-999;
int Number2 =-999;
int Number3 =-999;
Scanner input=new Scanner(System.in);
System.out.println("What is the first number of your locker combo?");
Number1=input.nextInt();
System.out.println("What is the second number of your locker combo?");
Number2=input.nextInt();
System.out.println("What is the third number of your locker combo?");
Number3=input.nextInt();
System.out.println(Number1 + "-" + Number2 + "-" + Number3);
input.close();


	}

}

package imputExamples;

import java.util.Scanner;

public class passwordGenerator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int digit1=-999;
int digit2=-999;
int digit3=-999;
Scanner input=new Scanner(System.in);
System.out.println("What is your first digit?");
digit1=input.nextInt();
System.out.println("What is your second digit?");
digit2=input.nextInt();
System.out.println("What is your third digit?");
digit3=input.nextInt();
System.out.println(digit1+""+digit2+""+digit3);
System.out.println(digit2+""+digit3+""+digit1);
System.out.println(digit3+""+digit2+""+digit1);
System.out.println(digit1+""+digit3+""+digit2);
System.out.println(digit2+""+digit1+""+digit3);
System.out.println(digit3+""+digit1+""+digit2);
input.close();

	}

}

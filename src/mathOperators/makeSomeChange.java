package mathOperators;
import java.util.Scanner;
public class makeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int amount=-999;
		int dollar=100;
		int quarter=25;
		int dime=-10;
		int nickel=5;
		int pennie=1;
	
		System.out.println("what is the value?");
		amount=input.nextInt();
		dollar=amount/100;
		quarter=(amount%100)/25;
		dime=((amount%100)%25)/10;	
		nickel=(((amount%100)%25)%10)/5;
		pennie=((((amount%100)%25)%10)%5)/1;
		System.out.println("dollars="+ dollar);
		System.out.println("Quarters=" + quarter);
		System.out.println("Dimes=" + dime);
		System.out.println("nickels=" + nickel);
		System.out.println("pennies=" + pennie);
		input.close();		
		
		

	}

}

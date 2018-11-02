package objectOrientation;
import java.util.Scanner;
public class TCbankaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner input = new Scanner(System.in);
	
		bankAccount checking = new bankAccount();
		bankAccount savings = new bankAccount();
		
		//Prompt the user for the necessary information.  
		
		System.out.println("What is the balance?");
		double checkingbalance= input.nextDouble();
		checking.setBalance(checkingbalance);
		//Deposit $100 into the savings account.
		savings.deposit(100);
		 
		
		//Change the interest rate of the checking account to 18%.  
		checking.setInterestRate(.18);
		
		//Withdraw $1000 from the checking account.  
		checking.withdraw(1000.0);
		//Add interest to the savings account.  
		savings.addInterest();
		//Assess the checking account a finance charge.  
		checking.financeCharge(.5);
		//Display the state of both objects.
		System.out.println("checking account ");
		System.out.println("balance= " + checking.getBalance());
		System.out.println("interest rate= "+ checking.getRate());
		System.out.println("account number=  " + checking.getAccountNum());
		System.out.println("savings account ");
		System.out.println("balance= " + savings.getBalance());
		System.out.println("interest rate= "+ savings.getRate());
		System.out.println("account number=  " + savings.getAccountNum());
	}
	

}

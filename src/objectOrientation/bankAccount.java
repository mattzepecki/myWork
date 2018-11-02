package objectOrientation;

public class bankAccount {
	 private double balance;
	 private int accountNum;
	 private double interestRate;
	 
	 		bankAccount() {
		    balance = 6000.0;
		    accountNum = 526735;
		    interestRate = 0.15;
		    }
	 		
	 	   public bankAccount(double newBalance, int newAccountNum, double newInterestRate) {
	 		    setBalance(newBalance);
	 		    setAccount(newAccountNum);
	 		    interestRate = newInterestRate;
	 		    
	 		    }

	 		    public double getBalance() {
	 		    return balance;
	 		    }

	 		    public int getAccountNum() {
	 		    return accountNum;
	 		    }

	 		    public double getRate() {
	 		    return interestRate;
	 		    }

	 		    public void setBalance(double newBalance) {
	 		    balance = newBalance;
	 		    }

	 		    public void setAccount(int newAccount) {
	 		    	
	 		    	if(newAccount > 999999) {
	 		    		//throw error;
	 		    	}
	 		    	
	 		    accountNum = newAccount;
	 		    }

	 		    public void setInterestRate(double newInterestRate) {
	 		    interestRate = newInterestRate;
	 		    }

	 		    public void deposit(double deposit) {
	 		    balance += deposit;
	 		    }

	 		    public void withdraw(double withdraw) {
	 		    balance -= withdraw;
	 		    }

	 		    public void addInterest() {
	 		    balance += balance * interestRate;
	 		    }

	 		    public void financeCharge(double financeCharge) {
	 		    balance -= financeCharge;
	 		    }
	 		     
}



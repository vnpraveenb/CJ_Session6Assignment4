package bankatm;

 
/**
 * @author Praveen
 *
 */
class BankATMException extends Exception{
	
	String errorMessage;
	
	/**
	 * @param str
	 */
	public BankATMException(String str)
	{
		this.errorMessage = str;
	}
	
 	 
    /* (non-Javadoc)
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString()
    {
        return errorMessage;
    }
}


/**
 * @author Praveen
 *
 */
class BankAtm{
	
	int atmId;
	String bankName;
	String location; 
	double balance;
	
	/**
	 * @param atmId
	 * @param bankName
	 * @param location
	 * @param balance
	 */
	public BankAtm(int atmId, String bankName, String location, int balance)
	{
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	
	/**
	 * @param amt
	 * @throws BankATMException
	 */
	public void withdraw(double amt) throws BankATMException
	{
		 
		if(((balance - amt)<=0) || (balance < 10000))
		{
			System.out.println();
			//throws BankATMException if amount is greater than the balance or if balance less than 10,000
			throw new BankATMException("Transaction not allowed: Insufficient Funds ");  
		}
		else
		{
			System.out.println("\nTransaction in ATM: " +atmId);
			System.out.println("Balance: " + balance);
			balance = balance - amt;
			System.out.println("Amount withdrawn: "+ amt );
			System.out.println("Balance after withdrawal: " + balance);
		}
	}
	
	/**
	 * @param amt 
	 */
	public void deposit(double amt)
	{
		System.out.println("\nTransaction in ATM: " +atmId);
		System.out.println("Balance: " + balance);
		balance = balance + amt;
		System.out.println("Amount deposited: "+ amt );
		System.out.println("Balance after deposit: " + balance);
	}
}
 

/**
 * @author Praveen
 *
 */
public class BankAtmDemo {

	
	public static void main(String[] args)  {
 		
		System.out.println("Bank ATM application");
		
		BankAtm atm1 = new BankAtm(125,"ICICI","Koramangala",25000); 
		BankAtm atm2 = new BankAtm(128,"ICICI","HSR Layout",15000); 
		BankAtm atm3 = new BankAtm(129,"ICICI","Koramangala",20000); 

		try {
			atm1.deposit(2000);
			atm1.withdraw(200000);

		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		try {
			atm2.deposit(3000);
			atm2.withdraw(6000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			atm3.deposit(1700);
			atm3.withdraw(11800);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

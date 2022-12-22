package bank;

public class BankMain {

	public static void main(String[] args) {
		
		// Initializing BankA,BankB and BankC
		Bank bankA = new BankA();
		Bank bankB = new BankB();
		Bank bankC = new BankC();
		  
		// Printing Balance
		System.out.println("Balance in Bank A: " + bankA.getBalance());
		System.out.println("Balance in Bank B: " + bankB.getBalance());
		System.out.println("Balance in Bank C: " + bankC.getBalance());

	}

}

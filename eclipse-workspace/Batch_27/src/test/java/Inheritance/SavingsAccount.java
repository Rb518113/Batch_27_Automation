package Inheritance;

public class SavingsAccount extends CheckingAccount {
	//single level (CLASS A to CLASS B)
	
public static void main(String[] args) {
	//Create object with the Parents class --Wrong approch 
	// Becasue of we are not geeting the child class properties.
	CheckingAccount obj1= new CheckingAccount();
	obj1.accountActivity();
	


     //Create object with the child class --Right approch
	// Becasue  we can get both parents class and child class properties.
	SavingsAccount obj = new SavingsAccount();
	obj.accountActivity();
	obj.savingActivity();
	
	
}
	
	
	public  void savingActivity() {
		//System.out.println(CheckingAccount.accountName);
		CheckingAccount.balance = 10000;
		CheckingAccount.withdraw = 1000;
		CheckingAccount.deposit = 5000;
		CheckingAccount.total = CheckingAccount.balance -CheckingAccount.withdraw +CheckingAccount.deposit;
		System.out.println(CheckingAccount.accountName+ " total saving account balance$ "+ CheckingAccount.total);
	}
	
	
}

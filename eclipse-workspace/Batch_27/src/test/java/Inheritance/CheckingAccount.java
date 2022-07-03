package Inheritance;

public class CheckingAccount {
//we are not intialize any value at the class level 
//and instance level variable becasue of we need to reuse those variable
	
	//declaring all the variable
	static int balance; 
	static int withdraw;
	static int deposit;
	static String accountName = "Turikul Islam";
	static int total;

	
	
 protected void accountActivity() {

	balance = 1500;
	withdraw = 100;
	deposit = 9999;
	total = balance-withdraw+deposit;
	System.out.println(accountName + " total checking account balance $"+total);
 }
 
}
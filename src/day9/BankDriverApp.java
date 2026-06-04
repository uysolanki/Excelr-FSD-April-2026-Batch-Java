package day9;

import java.util.Scanner;

public class BankDriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankingServices bank=new HDFCBank(5000.0);
		int choice=0;
		do
		{
			System.out.println("*** Banking Menu ***");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Online Transfer");
			System.out.println("4. Check Balance");
			System.out.println("0. Exit");
			
			System.out.println("Enter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: bank.deposit(); break;
			case 2: bank.withdraw(); break;
			case 3: bank.onlineTransfer(); break;
			case 4: bank.checkBalance(); break;
			case 0: System.out.println("Closing App..."); System.exit(0);
			default : System.out.println("Invalid Input");
			}
			
		}while(choice!=0);

	}

}

package atm.project;


import java.util.Scanner;

public class Atm_oprject {

	public static void main(String[] args) {
		
		int balance=10000,withdraw = 0,deposit;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("welcome to kumaran mini ATM");
			
			System.out.println("click 1 for withdraw money");
			System.out.println("click 2 for deposit money");
			System.out.println("click 3 for check balance");
			System.out.println("click 4 for exit");
			System.out.println("choose the operation what you want to perform:");
			
			int n = sc.nextInt();
			
			switch(n) {
			
			
				
			case 1:
				System.out.println("enter your money to withdraw ");
				if(balance>=withdraw) {
					balance= balance-withdraw;
				}
				else {
					System.out.println(" your balance is insufficient.try less amount");
				}
				System.out.println(" ");
				break;
				
			case 2 :
				
				System.out.println("Enter money to deposit");
				deposit = sc.nextInt();
				balance = balance+deposit;
				System.out.println("your money is succesfully deposited");
				System.out.println(" ");
				break;
				
				
			case 3 :
				System.out.println("balance:"+balance);
				System.out.println(" ");
				break;
				
			case 4 :
				System.exit(0);
				
				
			}
			
		}
		
	}
		}
	
		
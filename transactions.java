package com.paymoney.transactions;

import java.util.Scanner;

public class transactions {

//User interface of PayMoney
		Scanner input;
		
		int transactionSize;
		int [] transactions;
		int numberOfTarget;
		int target;
	
		public transactions() {
		input = new Scanner(System.in);
		}
	
//To take input from user
	public void inputFromUser() {
		System.out.println("Enter the size of transaction array");
		transactionSize= input.nextInt();
		transactions = new int [transactionSize];
		System.out.println("Enter the values of array");
		for (int i=0; i<transactionSize; i++) {
		transactions[i]=input.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		numberOfTarget=input.nextInt();
//Using for loop to accept different target as entered by user
		
		for 
		(int tc=0; tc<numberOfTarget; tc++)
		{
		System.out.println("Enter the value of target");
		target=input.nextInt();
		}
//function to calculate and printing the result and per provided input 
		getResult(transactions, target);
		}
//method to calculate and printing the result
		public static void getResult(int [] transactions, int dailyTarget) {
		targetcalculator calculator =new targetcalculator(transactions, dailyTarget);
		calculator.calculate();
		calculator.printResult();
	}
}

//By ~Uprant
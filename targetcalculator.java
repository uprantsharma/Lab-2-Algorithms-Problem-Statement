package com.paymoney.transactions;

public class targetcalculator {

	private int[] transactions;
	private int dailyTarget;
	private int trxCounter;
	private boolean dailyTargetStatus;
	private String newline;

// Constructors to set the value of Transactions, dailytarget, Trxcounter, targetstatus

	public targetcalculator(int[] transactions, int dailyTarget) {
		this.transactions = transactions;
		this.dailyTarget = dailyTarget;
		this.dailyTargetStatus = false;
		this.trxCounter = 0;
	}

//checking, after how many transactions the target has achieved 

	public void calculate() {

//Storing updates value in tempcounter
		int tempCounter = dailyTarget;
		for (int index = 0; index < transactions.length; index++) {
			trxCounter++;

			tempCounter -= transactions[index];
// Let's check whether the target has achieved

			if (tempCounter <= 0) {
				dailyTargetStatus = true;
				break;
			}
		}
	}

//Printing the result basis on the status

	public void printResult() {
		if (dailyTargetStatus) {
			System.out.println("Target achieved after " +trxCounter + " Transactions");
		} else
			
			System.out.println("Given target is not achieved | "
					+ "Explanation Since there is only 1 transaction that is of 100 and the target value is 101, hence target is not achieved.");
	}

}

//By ~Uprant
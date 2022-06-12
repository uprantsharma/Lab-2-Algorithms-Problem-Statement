package com.traveler.currency;

public class currernydenomination {
	
	private int [] denomination;
	private int payAmount;
	private int [] resultDenominationArray;
	private int [] resultDenominationCountArray;
	
//Constructor to collect denomination and pay the amount and also creating arrays to store denomination of their count.
		public currernydenomination (int [] denomination, int payAmount) {
		this.denomination=denomination;
		this.payAmount=payAmount;
		this.resultDenominationArray= new int [this.denomination.length];
		this.resultDenominationCountArray= new int [this.denomination.length];
	}
		public void curdenomination() 
	{
//Sorting denomination in desending order
		bubbleSort(denomination);
		
//Sorting the remain balance after denomination
		int balanceAmount=payAmount;

//Sorting the denomination number
		int noOfDenomination=denomination.length;
		int index =0;
		int resultIndex =0;
		while (index<noOfDenomination) {

//Store Quotient and remainder for the denomination present at position equal to index
		int quotient = balanceAmount / denomination[index];
		int remainder = balanceAmount % denomination[index];
		
		if (quotient!=0) 
	{
		int temp = (quotient * denomination[index]);
		balanceAmount-=temp;
		resultDenominationArray[resultIndex] = denomination[index];
		resultDenominationCountArray[resultIndex++] = quotient;
		if(remainder == 0)
	{
		if (balanceAmount == 0)
	{
		printSuccessMessege(resultIndex);
		break;
		}	
	}
}

// Referring question : assuming the denomination are in such way that any amount cab be paid 
		else
	{
		if (remainder == 0)
	{
		break;
	}
}
		index++;
		}
	}
		
// Putting bubblesort logic to arrange the input in descending order
		public static void bubbleSort(int [] array) 
	{
		int length = array.length;
		int temp;
		for (int i=0; i<length; i++)
	{
		for (int j=1;j<(length-i); j++) 
	{
		if (array [j-1]<array[j]) 
	{
		temp=array [j-1];
		array [j-1]=array[j];
		array [j]=temp;
			}
		}
	}
}

// time to print the denomination and the count
		public void printSuccessMessege(int index) {
		System.out.println("Your payment approach in order to give min no of notes will be ");
		for (int i=0; i<index; i++) {
		System.out.println(resultDenominationArray[i] + " : "+ resultDenominationCountArray[i]);
		}
	}
}
		
		
// By ~Uprant
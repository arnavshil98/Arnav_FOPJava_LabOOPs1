package com.fop.lab1;

import java.util.HashMap;

public class BankingFacilities {
	HashMap<String, Double> accAmt;
	Double finalAmt;

	public String otp(int size) {
		int[] myNumbers = new int[10];
		String result = "";
		int index;
		for (int i = 0; i < myNumbers.length; i++) {
			myNumbers[i] = i;
		}
		for (int i = 0; i < size; i++) {
			index = (int) Math.floor(Math.random() * 10);
			if (myNumbers[index] >= 0) {
				result = result + myNumbers[index] + "";
				myNumbers[index] = -1;
			} else {
				i--;
			}
		}
		return result;
	}

	public Double accCurrAmt(String userName) {
		accAmt = new HashMap<>();
		accAmt.put("17109567891", 90000.50);
		accAmt.put("67109561191", 20000.50);
		accAmt.put("37119567891", 15000.50);

		return accAmt.get(userName);
	}

	public void deposit(String userName, Double depositAmount) {
		Double currentAmount = accCurrAmt(userName);
		finalAmt = currentAmount + depositAmount;
		accAmt.replace(userName, finalAmt);
		System.out.println("amount in the account updated: " + accAmt.get(userName));
	}

	public void withdraw(String userName, Double withdrawAmount)  {
		Double currentAmount = accCurrAmt(userName);
		if (withdrawAmount <= currentAmount) {
			finalAmt = currentAmount - withdrawAmount;
			accAmt.replace(userName, finalAmt);
			System.out.println("amount in the account left: " + accAmt.get(userName));
		}
		else {
			System.out.println("withdraw amount is greater than currentAmount");
			System.out.println("transaction failed...");
		}

	}

}

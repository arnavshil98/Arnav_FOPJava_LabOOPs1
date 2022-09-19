package com.fop.lab1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainPortal {

	public static void main(String[] args) throws Exception {

		/* metadata:
		 * account no: password: current amount
		 *"17109567891": "21540": 90000.50
		 *"67109561191": "32190": 20000.50
		 *"37119567891": "67190": 15000.50
		 */
		
		
		
		System.out.println("please insert account number: ");
		Scanner sc1 = new Scanner(System.in);
		String userName = sc1.nextLine();

		System.out.println("please insert password: ");
		Scanner sc3 = new Scanner(System.in);
		String password = sc3.next();

		CutomerDetails cust = new CutomerDetails(userName, password);

		ArrayList<String> trxList = new ArrayList<>();
		trxList.add("Deposit");
		trxList.add("WithDraw");
		trxList.add("Transfer");
		trxList.add("Logout");
		System.out.println("please select transaction type from the list: "+trxList.toString());

		System.out.println("please select transactin type: ");
		Scanner type = new Scanner(System.in);
		String TrxType = type.next();

		switch (TrxType) {
		case "Deposit": {
			System.out.println("please insert amount: ");
			Scanner sc2 = new Scanner(System.in);
			Double depositAmount = sc1.nextDouble();

			BankingFacilities bank = new BankingFacilities();

			bank.deposit(userName, depositAmount);
			break;
		}

		case "WithDraw": {
			System.out.println("please insert amount: ");
			Scanner sc2 = new Scanner(System.in);
			Double withDrawAmt = sc1.nextDouble();

			BankingFacilities bank = new BankingFacilities();

			bank.withdraw(userName, withDrawAmt);
			break;
		}
		case "Transfer": {
			System.out.println("please insert amount: ");
			Scanner sc2 = new Scanner(System.in);
			Double withDrawAmt = sc1.nextDouble();

			BankingFacilities bank = new BankingFacilities();
			String mobileOtp = bank.otp(4);
			System.out.println("system generated otp: "+mobileOtp);
			System.out.println("please verify otp: ");
			Scanner sc = new Scanner(System.in);
			String manualOtp = sc.next();
			if(manualOtp.equals(mobileOtp)) {
				bank.withdraw(userName, withDrawAmt);
				break;	
			}
			else {
				System.out.println("verification failed");
				break;
			}
			
		}
		case "Logout":{
			System.out.println("succesfully logged !");
		}
		default: System.out.println("invalid transaction type");
		}
		
		System.out.println("logged out!");

	}

}

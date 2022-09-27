package com.fop.lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class HrmsPortal {

	public static void main(String[] args) throws Exception {

		StringBuffer str = new StringBuffer();
		/*
		 * (1:Technical, 2:Admin, 3:Human Resource, 4:Legal)
		 */
		Employee emp = new Employee("arnav", "shil");
		str.append(emp.getFirstName());
		String lstName = emp.getLastName();
		str.append(lstName.concat("@"));
		Scanner sc = new Scanner(System.in);
		System.out.println("please select departments:");
		System.out.println("(1:Technical, 2:Admin, 3:Human Resource, 4:Legal)");
		str.append(emp.dept(sc.nextInt()).concat(".greatlearning.com"));

		String fname = emp.getFirstName();
		ArrayList<String> f1 = new ArrayList<>();
		StringBuffer IntitCap = new StringBuffer();
		for (int i = 0; i < fname.length(); i++) {
			if (i == 0) {
				f1.add(String.valueOf(fname.charAt(i)).toUpperCase());
			} else {
				f1.add(String.valueOf(fname.charAt(i)));
			}

		}
		for (String alphabet : f1) {
			IntitCap.append(alphabet);
		}

		System.out.println("Dear " + IntitCap + " your generated credentials are as follows");
		System.out.println("Email --->" + str);

		System.out.println("Password --->" + emp.systemPassword());
	}

}

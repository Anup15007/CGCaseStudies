package com.cg.payroll.client;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {
	public static void main(String[] args) {
			PayrollServices services = new PayrollServicesImpl();
			Scanner sc = new Scanner(System.in);	
			System.out.println("******************PAYROLL SYSTEM********************");
			char ch='y';
			while(ch=='y'||ch=='Y') {
				System.out.println("Enter your choice:\n1. Save Associate\n2. Calculate Net Salary\n3. Get Associate Details"
						+ "\n4. Get All Associate Details");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					int associateId=services.acceptAssociateDetails("Anup", "Banerjee", "anup@gmail.com", "TCD", "A4", "CHD9776", 60000, 20000, 1000, 1500, 5896642, "Citi", "citi0006");
					System.out.println("Associate Id: "+associateId);
					break;
				case 2:
					System.out.println("Enter associate id to calculate net salary: ");
					int assoId = sc.nextInt();
					int netSalary = services.calculateNetSalary(assoId);
					System.out.println("Net Salary = "+netSalary);
					break;
				case 3: 
					System.out.println("Enter associate id to find details: ");
					assoId = sc.nextInt();
					Associate associateDetails = services.getAssociateDetails(assoId);
					System.out.println(associateDetails);
					break;
				case 4:
					List<Associate> allAssociateDetails = services.getAllAssociatesDetails();		
					System.out.println(allAssociateDetails);
					break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
				System.out.println("Do you want to continue(y/n): ");
				ch = sc.next().charAt(0);
			}
	}
}

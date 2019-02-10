package com.cg.studentadmission.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.studentadmission.beans.Student;
import com.cg.studentadmission.services.ServicesImpl;

public class StudentAdmissionTest {
	public static ServicesImpl services;
	
	@BeforeClass
	public static void setUpTestEnv() {
		services = new ServicesImpl();
	}
	@Before
	public void setUpTestData() {
		HashMap<Integer,Student> transactions1 = new HashMap<Integer, Student>();
		Student student1 = new Student(101, 5847, "Savings", "ACTIVE", 12000, students1);
		HashMap<Integer,Transaction> transactions2 = new HashMap<Integer, Transaction>();
		Account account2= new Account(102, 7485, "Savings", "ACTIVE", 10000, transactions2);
		
		BankingDBUtil.accounts.put(account1.getAccountNo(), account1);
		BankingDBUtil.accounts.put(account2.getAccountNo(), account2);
		
		BankingDBUtil.ACCOUNT_NUMBER=102;
	}
	@Test
	public void test() {
		
	}

}

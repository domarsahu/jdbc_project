package com.jsp.view;

import com.jsp.controller.*;

/*  A Government want build application for public where they can apply for voter id by taking details of 
 * name ,email, phone, age, nationality, address provide the voter id if his age is more than 18 and only 
 * he is INDIAN , store data in voter database don't allow duplicate moblie number 
 * 
 * Note:-  use java Bean Class
 * 
 *			Build the logic 
 *			Build CLI appliction 
 *			Take any other information id necessary
 
 */

import java.util.Scanner;

public class Display {
	static Scanner sc = new Scanner(System.in);
	
	public static void add() {
		System.out.println();
		System.out.print("Enter your age : ");
		int age =sc.nextInt();
		System.out.print("Your Nationality is Indian \nEnter Y/N  : ");
	//	String nationality = sc.next();
		String yes ="Y";
		String no = "N";
		
		String resYes = sc.next().toUpperCase();
		
		String nationality = "INDIAN" ; 
		
		if(age>=18 && resYes.equals(yes))
		{
			System.out.println();
			System.out.print("Enter the Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter the Email Id : ");
			String email =sc.next();
			System.out.print("Enter the Phone Number ");
			long phone = sc.nextLong();
			System.out.print("Enter your Address : ");
			sc.nextLine();
			String address=sc.nextLine();
			
			VoterController vc = new VoterController();
			vc.insertData(name, email, phone, age,nationality, address);
		}
		else if(age>=18 && resYes.equals(no)) {
			System.out.println("Your Nationality is not Indian");
		}
		
		else if(age<=18 && (resYes.equals(yes) || resYes.equals(no))){
			System.out.println("Your age is lessthan from 18 year");
		}
		
		else  {
			System.out.println("Your age is lessthan from 18 year and Invalid character ");
		}

	}
	
	
	
	public static void delete() {
		System.out.println();
		System.out.print("Enter the email id : ");
		String email = sc.next();
		
		VoterController vc1 = new VoterController();
		vc1.deleteData(email);
		
		
	}
	
	
	
	public static void update() {
		System.out.println();
		System.out.print("Enter the email id : ");
		String email = sc.next();
		System.out.print("Enter the phone number : ");
		long phone = sc.nextLong();
		System.out.println();
		System.out.print("Enter the new name :");
		sc.nextLine();
		String nname= sc.nextLine();
		System.out.print("Enter the new email id :");
		String nemail =  sc.next();
		System.out.print("Enter the new phone number :");
		long nphone = sc.nextLong();
		System.out.print("Enter the new age :");
		int nage = sc.nextInt();
		System.out.print("Enter the new address :");
		sc.nextLine();
		String naddress = sc.nextLine();
		
		VoterController vc2 = new VoterController();
		vc2.updateData(email, phone, nname, nemail, nphone, nage, naddress);
		
	}
	
	
	public static void display() {
		System.out.println();
		System.out.print("Enter the email id : ");
		String email = sc.next();
		System.out.print("Enter the phone number : ");
		long phone = sc.nextLong();
		
		VoterController vc3 = new VoterController();
		vc3.displayData(email, phone);
		
		
	}
	
}

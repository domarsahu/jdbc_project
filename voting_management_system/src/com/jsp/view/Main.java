package com.jsp.view;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	//	int repeate;
		do {
			System.out.println("** Welcome voter Application **");
			System.out.println();
			System.out.println("1. Add The Voter Id ");
			System.out.println("2. Delete The Voter Id");
			System.out.println("3. Update The Voter Id");
			System.out.println("4. Display The Voter Id");
			System.out.println();
			System.out.print("Choice the number : ");
			int res= sc.nextInt();
			switch (res)
				{
					case 1: {
						System.out.println("** Add The Voter Id **");
						Display.add();
						break;
						}
					
					case 2: {
						System.out.println("** Delete The Voter Id **");
						
						Display.delete();
						break;
						}
			
					case 3: {
						System.out.println("** Update The Voter Id **");
						Display.update();
						break;
						}
			
					case 4: {
						System.out.println("** Display The Voter Id **");
						Display.display();
						break;
						}
					
					default : {
						System.out.println("Invalid characater ");
						break;
					}			
				}
			System.out.println();
			
		}while(true);
		
	}

}

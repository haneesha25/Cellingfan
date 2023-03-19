package fanSpeed;

import java.util.*;

import java.time.LocalDate;  

public class Main {
	
	public static void main(String[] args)
	{
		
		LocalDate time = LocalDate.parse("2023-12-25");
		LocalDate time2 = java.time.LocalDate.now();
		Scanner scan = new Scanner(System.in);
		CeilingFanControls fanControls = new CeilingFanControls();
		System.out.println("Time2 = " + time2 + " Time= " + time);  
		
		while(true)
		{
			System.out.println("=======================================================");
			System.out.println("Select your options: ");
			System.out.println("1. Pull the cord to increase the speed");
			System.out.println("2. Pull the cord to change the fan direction");
			System.out.println("3. Today is 25th December");
			System.out.println("4. Today is not 25th December");
			System.out.println("5. Exit");
			
		try
		{
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			switch(choice)
			{
			case 1: 
				fanControls.fanSpeed();
				break;
				
			case 2: 
				fanControls.fanDirection();
				break;
				
			
			case 3: 
				fanControls.specialDay(true);
				break;
			
			case 4:
				fanControls.specialDay(time == time2);
				break;
				
			case 5: 
				System.out.println();
				System.exit(0);
				
			default: System.out.println("\"Wrong option selected. Choose from the given menu.");
			    continue;
			}

		}
		catch(Exception e)
		{
			System.out.println("Input mismatch, try again");
			scan.next();
			continue;
		}
		
		}
		
		
		
	}

}

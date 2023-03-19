package fanSpeed;

import java.time.LocalDate;  

public class CeilingFanControls implements CeilingFan{
	
	int fanSpeedNumber = 1;
	boolean specialStatus = false;//variable use to control 25th December day
	String fanDirectionStatus = "regular";
	
	//Method used to control fan speed
	public void fanSpeed()
	{
		if(fanSpeedNumber > 0 && fanSpeedNumber <=3 && specialStatus == false)
		{
		
		System.out.println("Fan speed increased to " + fanSpeedNumber + " in the " + fanDirectionStatus + " direction");
		fanSpeedNumber+=1;
		}
		else if(fanSpeedNumber >3)
		{
			System.out.println("Fan turned off.");
			fanSpeedNumber = 1;
		}
		
		else if(fanSpeedNumber != 0 && specialStatus == true)
		
		{
			System.out.println("Couldnot turn on the fan on 25th December.");
		}
	}
	
	//Method used to control fan direction
	public void fanDirection()
	{
		
		if(fanDirectionStatus == "regular")
		{
			fanDirectionStatus = "reverse";	
			System.out.println("Fan direction changed to reverse");
		}
		else
		{
			fanDirectionStatus = "regular";	
			System.out.println("Fan direction changed to regular ");
		}
	}
	
	public void specialDay(boolean status)
	{
		specialStatus = status;
		if(specialStatus == true)
		{
		System.out.println("The fan is OFF");
		}
		else
		{
			System.out.println("Pull the fan chords to turn on the fan.");
		}
		
	}

}

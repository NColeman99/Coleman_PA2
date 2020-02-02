import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		{
			// Name your variable to use later in the programming
			double inches,pounds,kilograms,meter,CalculatorBMI=0;
			
			//Make a scanner object which is used to get inputs insert by the creator

			Scanner input=new Scanner(System.in);
			
			System.out.println("Please Choose, height and weight");
			System.out.println("1)BMI = 703*weightInPounds/heightInInches^2");
			System.out.println("2)BMI = weightInKilograms/heightInMeters^2");
			int to =input.nextInt();
			switch(to)
			{
			// Calling the functions one by one 
			
			case 2:System.out.println("Enter weight in Kilograms");
			kilograms =input.nextDouble();
			
			System.out.println("Enter height in meter:");
			meter =input.nextDouble();
			CalculatorBMI= kilograms/(meter*meter);
			break;
			
			case 1: System.out.println("Enter weight In pound:");
			pounds =input.nextDouble();
			
			System.out.println("Enter height in inches");
			inches = input.nextDouble();
			CalculatorBMI = 703*pounds/(inches*inches);
			break;
			
			// After using break multiple times, default is where it ends when the user has no more variable to call out.
				default: System.out.println("Invalid");
				break;
				
			}
//Use the "if" statement declaring if this is one thing, then result will be this at the end.
			if(CalculatorBMI<=18.5)
				System.out.println("BMI is less than 18.5: UnderWeight");
			else if(CalculatorBMI<=24.9)
				System.out.println("BMI between 18.5 and 24.9: Normal weight");
			else if(CalculatorBMI<=29.9)
				System.out.println("BMI between 25 to 29.9: Overweight ");
			else 
				System.out.println("BMI of 30.0 or greater, means: obesity");
				
			}
			}
		
	}

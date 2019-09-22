import java.util.Scanner;

/* Pretema Dharampaul
 * COP3330 Due 9/22/19
 * 
 * Write a program that calculates BMI and determines category
 * 
 */
public class Dharampaul_p2 {
	 public static void main(String args[]) {
		 	int choice;
		 	double bmi;
		 	double weightInPounds;
		 	double heightInInches;
		 	double weightInKilograms;
		 	double heightInMeters;
		 	
		 	System.out.println("Type 1 for Imperial or 2 for metric");
		    Scanner scnr = new Scanner(System.in);
		    choice = scnr.nextInt();
		    
		    if(choice == 1) {
		    	System.out.println("Enter your weight in pounds:");
		    	weightInPounds = scnr.nextDouble();
		    	System.out.println("Enter you height in inches:");
		    	heightInInches = scnr.nextDouble();
		    	
		    	bmi = (703*weightInPounds)/(heightInInches*heightInInches);
		    	
		    	System.out.println("BMI = " +bmi);
		    	
		    }
		    else {
		    	System.out.println("Enter your weight in Kilograms:");
		    	weightInKilograms = scnr.nextDouble();
		    	System.out.println("Enter you height in meters:");
		    	heightInMeters = scnr.nextDouble();
		    	
		    	bmi = (703*weightInKilograms)/(heightInMeters*heightInMeters);
		    	
		    	System.out.println("BMI = " +bmi);
		    }
		    System.out.println();
		    	
		    System.out.println("BMI Categories:\r\n" + 
		    		"Underweight = <18.5\r\n" + 
		    		"Normal weight = 18.5–24.9\r\n" + 
		    		"Overweight = 25–29.9\r\n" + 
		    		"Obesity = BMI of 30 or greater");
		    scnr.close();
	 }   
}

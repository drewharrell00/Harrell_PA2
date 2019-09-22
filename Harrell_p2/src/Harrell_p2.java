
import java.util.Scanner;
public class Harrell_p2 {

	public static void main(String[] args) {
		
		double w, h, bmi = 0;
		int mode;
		Scanner input = new Scanner( System.in);
		
		System.out.print("Type 1 if you want to use lb and 2 if you want to use kg: ");
		mode = input.nextInt();
		
		if(mode == 1) {
			
			System.out.print("Enter weight in pounds: ");
		    w= input.nextDouble();
		    System.out.println("Enter height in inches: ");
		    h = input.nextDouble();
		
		    bmi = (703 * w) / (h * h);
		}
		
		else if(mode == 2) {
			
			System.out.print("Enter weight in Kilograms: ");
			w = input.nextDouble();
			System.out.println("Enter height in meters: ");
			h = input.nextDouble();
			
			bmi = w / (h * h);
		}
		
		else {
			System.out.println("Please enter 1 or 2");
		}
			
		System.out.println("Bmi = " + bmi);
		System.out.println("\nBMI Categores:");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		input.close();

	}

}

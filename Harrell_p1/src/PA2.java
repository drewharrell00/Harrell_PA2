
import java.util.Scanner;

public class PA2 {

	public static void main(String[] args) {    
	    int firstDigit, secondDigit, thirdDigit, fourthDigit, number, temp, temp2;
	    Scanner input = new Scanner( System.in );
	 

	    System.out.print(" Enter Number: ");
	    number = input.nextInt();
	 
	    firstDigit = number / 1000;
	    secondDigit = number / 100 % 10;
	    thirdDigit = number / 10 % 10;
	    fourthDigit = number % 10;
	 
	    firstDigit = (firstDigit + 7) % 10;
	    secondDigit = (secondDigit + 7) % 10;
	    thirdDigit = (thirdDigit + 7) % 10;
	    fourthDigit = (fourthDigit + 7) % 10;
	 
	    temp = firstDigit;
	    firstDigit = thirdDigit;
	    temp2 = secondDigit;
	    secondDigit = fourthDigit;
	        
	    System.out.println("" + firstDigit + secondDigit + temp + temp2);
	    input.close();
	    
	}
}
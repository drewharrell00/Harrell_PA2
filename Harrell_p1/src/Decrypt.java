
import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
        int firstDigit, secondDigit, thirdDigit, fourthDigit, number, temp, temp2;
        Scanner input = new Scanner( System.in );
 

        System.out.print(" Enter Number: ");
        number = input.nextInt();
 
        firstDigit = number / 1000;
        secondDigit = number / 100 % 10;
        thirdDigit = number / 10 % 10;
        fourthDigit = number % 10;
 
        firstDigit = (firstDigit - 7) % 10;
        secondDigit = (secondDigit - 7) % 10;
        thirdDigit = (thirdDigit - 7) % 10;
        fourthDigit = (fourthDigit - 7) % 10;
 
        temp = firstDigit;
        firstDigit = thirdDigit;
        temp2 = secondDigit;
        secondDigit = fourthDigit;
        
        if(firstDigit < 0) {
        	firstDigit += 10;
        }
        if(secondDigit < 0) {
        	secondDigit += 10;
        }
        if(temp < 0) {
        	temp += 10;
        }
        if(temp2 < 0) {
        	temp2 +=10;
        }
 
        System.out.println("" + firstDigit + secondDigit + temp + temp2);
        input.close();
    }

}


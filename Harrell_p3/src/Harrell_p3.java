import java.util.Scanner;

public class Harrell_p3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	       int i;
	       int rating;
	       
	       System.out.println("Rate each topic from 1(least important) - 10(most important): 1.NFL 2.NCAAF 3.Soccer 4.Baseball 5.Hockey ");
	       
	       for(i=0; i<5; i++) {
	    	   rating = input.nextInt();
	    	   }
	    	       	   	    	   	       
	      
	       input.close();
	}
}

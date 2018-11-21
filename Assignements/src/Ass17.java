import java.util.Scanner;

//Read the numbers from console entered by the user
//and print the minimum and maximum number the user has entered.
//Before the user enters the number, print the message 
//"Enter number"
//If the user enters an invalid number, break out of 
//the loop and print the minimum and maximum number.
//
//Hint:
//Use an endless while loop


public class Ass17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber=0;
		
		int min = 0;
		int max = 0;
		
		while (true) {
			System.out.println("Enter number ");
			inputNumber=scanner.nextInt();
			if (inputNumber<0) {
				System.out.println("Invalid number. Min number is " + min+ ", "
						+ "Max number is " + max);
				break;
			}else if (inputNumber>=max) {
				min=max;
		    	max=inputNumber;
		    	System.out.println("Min number is " + min+ ", "
						+ "Max number is " + max);
		    }else  {
		    	min=inputNumber;
			System.out.println("Min number is " + min+ ", "
					+ "Max number is " + max);
		    }
	
		}
		scanner.close(); 
		   
	}
}

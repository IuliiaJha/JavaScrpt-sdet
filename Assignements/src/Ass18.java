import java.util.Arrays;
import java.util.Scanner;

//1. Create a program using arrays that sorts a list of integers
//in descending order. Descending order is highest value to lowest.
//In other words if the array had the values in int 106,26,81,5,15
//your program should ultimately have an array with 106,81,26,15,5 in it.
//2. Set up the program so that the numbers to sort are read in 
//from the keyword.
//3. Implement the following methods - getIntegers, printArray, 
//and sortIntegers.
//    getIntegers returns an array of entered integers from 
//  keyword.
//    printArray prints out the contents of the array and 
//    sortIntegers should sort the array and return a new 
//    		array containing the sorted numbers
//4. You will have to figure out how to copy the array elements 
//from passed array into a new array and sort them and return the 
//new sorted array.

public class Ass18 {

	public static void main(String[] args) {
		
		
		int[] arr  = getIntegers(5);
		printArray(sortIntegers(arr));

	}
	
	public static int[] getIntegers(int number) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter " + number  + " integer values");
		int[] integers = new int[number];
		
		for(int i=0;i<integers.length;i++) {
			integers[i]=scanner.nextInt();
		}
		scanner.close();
		return integers;
		
		
	}

	public static int[] sortIntegers(int[] integers) {
       for (int i = 0; i < ( integers.length - 1 ); i++) {
	      for (int j = 0; j < (integers.length - 1 ); j++) {
	          if (integers[j] < integers[j+1]) 
	          {
	           int max = integers[j];
	            integers[j] = integers[j+1];
	            integers[j+1] = max;
	          }
	        }
	      }return integers;
	   
        }
       
	public static void printArray(int[] integers) {
		for (int i=0; i<integers.length;i++ ) {
			 System.out.println(integers[i]);
			
		}
	}
	
}
	
	


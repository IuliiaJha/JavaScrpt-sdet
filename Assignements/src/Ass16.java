//Write a method named getEvenDigitSum with one parameter of type int called number. 
//The method should return the sum of the even digits within the number. 
//If the number is negative, the method should return -1 to indicate
//an invalid value.
//
//Sample Output:
//getEvenDigitSum(123456789); //should return 20 since 2+4+6+8=20.
//getEvenDigitSum(252); //should return 4 since 2+2=4.
//getEvenDigitSum(-22); //should return -1 since the number is negative.


public class Ass16 {

	public static void main(String[] args) {
		 System.out.println(getEvenDigitSum(123456789));
		 System.out.println(getEvenDigitSum(252)); 
		 System.out.println(getEvenDigitSum(-22)); 
		 
	}
public  static int  getEvenDigitSum(int number) {
	int  currentDigit=0;
	int  sum=0;
	if   (number >=0) {
	    
          while(number >0) {
        	currentDigit=number%10;
    	  if (currentDigit%2==0) {
    	     sum +=currentDigit;
    	    		 }
    	     number=number/10;
          } 
               return sum;
               
	}   else {
	              return -1;
}
	}
}

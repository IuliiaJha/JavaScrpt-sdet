
public class Calculateinterest {

	public static void main(String[] args) {
		
// How much is the interest for the amount of $10000 and %2 interestRate
//		How much is the interest for the amount of $10000 and %3 interestRate
//		How much is the interest for the amount of $10000 and %4 interestRate
//		How much is the interest for the amount of $10000 and %5 interestRate
		System.out.println(calculateIntererst (1000,2));
		System.out.println(calculateIntererst (1000,3));
		System.out.println(calculateIntererst (1000,4));
		System.out.println(calculateIntererst (1000,5));
		
		
	System.out.println("---------------");
	
	for (int i=2; i<6; i++) {
		System.out.println(calculateIntererst (1000, i));
	}
	}

	public static double calculateIntererst( double amount, double interestRate) {
		
		return amount*(interestRate/100);
		
	}
	
}

//We will say that a number is "teen" if 
//it is in the range 13-19(inclusive)

//Write a method hasTeen with 3 parameters of type int.
//
//The method should return boolean and it needs to 
//return true if one of parameters is in range 
//13(inclusive) - 19(inclusive). Otherwise return false.
//
//Sample Output:
//
//hasTeen(9,99,19); = > true
//hasTeen(23,15,42); = > true
//hasTeen(22,23,34); = > false


public class Ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(hasTeen(9,99,19));
System.out.println(hasTeen(23,15,42));
System.out.println(hasTeen(22,23,34));

	}
public static boolean hasTeen(int a, int b, int c) {
	
	if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)) {
		return true;
	}else {
		return false;
	}
}
	
}

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter a byte value");
//	byte b1 = scanner.nextByte();
//	System.out.println("My byte value is " + b1);
//	
//	System.out.println("Enter a short value");
//    short s1 = scanner.nextShort();
//    System.out.println("My short value is " + s1);
//    
	System.out.println("Enter an int value");
    int i1 = scanner.nextInt();
    System.out.println("My short value is " + i1);
//    
//	System.out.println("Enter a boolean value");
//    boolean bool = scanner.nextBoolean();
//    System.out.println("My boolean value is " + bool);
//    
//    System.out.println(b1+"|"+s1+"|"+i1+"|"+bool);

   scanner.nextLine();               //     if we need to get string input from user after differen data type
    System.out.println("Enter a string value");
    String str= scanner.nextLine();
    System.out.println("My string value is " + str);
    
    System.out.println("Enter a string value2");
    String str2= scanner.nextLine();
    System.out.println("My string value is " + str2);

    scanner.close();
}
}

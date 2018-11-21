
//Write a method called printMegaBytesAndKiloBytes that has 1 parameter
//of type int with the name kiloBytes
//The method should not return anything(void) and it needs to calculate
//the megabytes and remaining kilobytes from the kilobytes parameter.
//
//Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
//XX represents the original value kiloBytes. YY represents the calculated megabytes. 
//ZZ represents the calculated remaining kilobytes.
//
//If the parameter kiloBytes is < 0 then print "Invalid Value"

public class Ass3 {

	public static void main(String[] args) {
		
		printMegaBytesAndKilobytes(5023);
		printMegaBytesAndKilobytes(2234);
		printMegaBytesAndKilobytes(2048);
		
	}

public static void printMegaBytesAndKilobytes(int kilobytes) {
		
if (kilobytes<0) {
System.out.println("Invalid value");
}else {
int megabyte=(int) (0.001*kilobytes);
				
int leftPart=kilobytes-(int)(megabyte*1000);

System.out.println(megabyte+" megabytes and "+leftPart+" kb");
}
	


	}
	
	}

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//byte
		byte b1=25;
		byte b2=-128;
		byte b3=127;
		System.out.println(b1+ "|"+ b2 +" | "+ b3);
		// byte b4 = 128;  <= out of byte range
		System.out.println("----------------");
		
		//short
		
		short s1=500;
		short s2 = - 32767;
		short s3 = 32767;
		// short s4 = 32768;  <= out of short range;
		System.out.println(s1+ " "+ s2 +" "+ s3);
		
		// int 
		int i1=-5000;
		int i2=100_000;
		int i3=5000;
		System.out.println(i1 + " "+ i2 +" "+ i3);
		 
		//long
		long l1=100_000_000;
		long l2=58878909034L;
		long l3 =279340567685946794L;
		System.out.println(l1 + "| "+ l2 +" | "+ l3);
		
		//floating point types have double as default type
		float f1=5.2f;
		double d1=5.2;
		System.out.println(f1 + "| "+ d1);
		
		//boolean 
		
		boolean bool=true;
		boolean bool2=false;
		
		//char
		
		char c1 ='E';
		char c2 ='D';
		char c3 ='@';
		char c4 ='\u00A3';
		System.out.println(c1 + "| "+ c2 + " "+ c4);
		
		
		
		
		
		
		
		
		
		
		
	}

}

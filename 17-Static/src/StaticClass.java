
public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticTest static1 = new StaticTest ("instatnce1");
System.out.println(static1.getName()+ " is "
		+ "instance number "
+ static1.getNumInstance() );

StaticTest static2 = new StaticTest ("instatnce2");
System.out.println(static2.getName()+ " is instance number "
+ static1.getNumInstance() );
	

	StaticTest static3 = new StaticTest ("instatnce3");
	System.out.println(static3.getName()+ " is instance number "
	+ static3.getNumInstance() );
		}
}

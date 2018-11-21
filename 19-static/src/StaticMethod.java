
public class StaticMethod {

	public static void main(String[] args) {
		Abc x = new Abc();
		x.show2();
		Abc.show1();
		
	}

}
	class Abc {
		public static void show1() {
			System.out.println("Hi");
			// show2();
			show4();
		}
		public  void show2() {
			System.out.println("Hi");
			show1();
		}
		public  void show3() {
			System.out.println("Hi");
			show2();
			show1();
		}
		public static void show4() {
			System.out.println("Hi");
		}
	}
	


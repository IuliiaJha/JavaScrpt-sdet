package com.cybertek.package1;

// import com.cybertek.package2.*;
//import com.cybertek.package2.Class2;
 

class Class1 {

	public static void main(String[] args) {
		//There are three ways to access package from outside the packege
		// 1 - import package.*;
		// 2 - import package.className;
		// 2 - fully qualified name;
	
com.cybertek.package2.Class2 c1 = new com.cybertek.package2.Class2();
com.cybertek.package2.Class3 cl2 = new com.cybertek.package2.Class3();
		
		
		 //Class2 c1 = new Class2();
		// Class3 cl2 = new Class3();
	}

}

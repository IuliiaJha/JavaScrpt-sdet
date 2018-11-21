package Set;


import java.util.TreeSet;

public class TreeSetClass {


	public static void main(String[] args) {
		TreeSet<Integer> values = new TreeSet<Integer>();
             values.add(456);
             values.add(78);
             values.add(3);
             
             
             values.add(6);
             values.add(8);
             values.add(88);
             
             for (int i: values) {
            	 System.out.println(i);
             }
	}

}

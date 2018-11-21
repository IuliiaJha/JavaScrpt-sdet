package List;

import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
	List<Integer>value = new ArrayList<Integer>();
	value.add(5);
	value.add(10);
	value.add(1,9);
	value.add(2);
	Collections.sort(value);

	System.out.println(value);
	for(int i : value) {
	System.out.println(i);
	}
	}

}

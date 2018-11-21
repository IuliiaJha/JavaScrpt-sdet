
public class Main {

	public static void main(String[] args) {
		// charAT(index) returns char valu2 for particular index
		String str = "JavaScript";
		System.out.println(str.charAt(3));
		
		// length
		System.out.println(str.charAt(3));
		
		// substring(int begingIndex) - returns substring for given index
		System.out.println(str.substring(5));
		
		// substring(int begingIndex, int endIndex (last index not included)
		System.out.println(str.substring(2,6));
		
		// contains() // returns true or false after matching the sequence of char values
		System.out.println(str.contains("va"));
		
		// equals(Object another) - cheks the equality of string with the given object;
		System.out.println(str.equals("JavaScript"));
		
		//isEmpty() - cheks if string is empty
		System.out.println(str.isEmpty());
		
		// concat(string str) - concatenates the specified string
		System.out.println(str.concat(" batch9"));
		
		// replace (char old, char new) - replaced all occurrences of the specified char value
		System.out.println(str.replace("Script", " "));
		
		//eqaulsIgnoreCase(string another) compares another sring It does not check case.
		System.out.println(str.equalsIgnoreCase("java"));
		
		// split(String delimeter) - return a split matching delimeter;
		String str2 = "JavaScript is the best batch ever";
		String[] myArray = str2.split(" ");
		for (String word: myArray) {
			System.out.println(word);
		}
		// indexOf - returns the specified char value index
			System.out.println(str.indexOf("v"));
			
		// indexOf(String substring, int indexEnd) - returns specified substring index starting with given 
			System.out.println(str.indexOf('a',1));
			
			
	// tolowerCase()
			System.out.println(str.toLowerCase());
			
	// toUpperCase()
			System.out.println(str.toUpperCase());
			
			// trim - removed spaces at the end and in the beginning
			System.out.println(str.trim());
			
	
					
		}
		
		
		
		
	}



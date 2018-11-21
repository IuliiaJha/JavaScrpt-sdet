
public class SwitchABC {

	public static void main(String[] args) {
		char swithcValue = 'A';
		switch(swithcValue){
			
			case 'C':case 'D':  case 'E': case 'A': case 'B':
				System.out.println("value " + swithcValue +  " was found");
				break;
				default:
					System.out.println("NOT found");
					break;
					
	}
	}

}

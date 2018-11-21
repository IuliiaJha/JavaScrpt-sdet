import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

// simpleDate format is a concrete class for formating and parsing date which inherits
// java.text.Dateformat class
// formatting means converting date  string to date
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
	    formatter = new SimpleDateFormat ("MM/dd/yyyy");
	    strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat ("MM/dd/yyyy hh:mm:ss");
	    strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat ("dd-M-yyyy");
	    strDate = formatter.format(date);
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat ("dd MMM yyyy");
	    strDate = formatter.format(date);
		System.out.println(strDate);
		
		
		formatter = new SimpleDateFormat ("dd MMM yyyy zzz");
	    strDate = formatter.format(date);
		System.out.println(strDate);
		
		
		formatter = new SimpleDateFormat ("E, dd MMM yyyy HH:mm:ss z");
	    strDate = formatter.format(date);
		System.out.println(strDate);
		
		
		// Convert String into Date
		formatter= new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = formatter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		
		
	}

}

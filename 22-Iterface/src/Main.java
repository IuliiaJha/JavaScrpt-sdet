
public class Main {

	public static void main(String[] args) {
		//DeskPhone mikePhone = new DeskPhone (37879, true);
		ITelephone mikePhone = new DeskPhone(37879, true);
mikePhone.answer();
mikePhone.callPhone(37879);
mikePhone.powerOn();
	}

}

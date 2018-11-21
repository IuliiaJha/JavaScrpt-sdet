package Computer;

public class PC {

	private Case theCase;
	private Monitor theMonitor;
	private Motherborad  theMotherboard;
	
	
	
	public PC(Case theCase, Monitor theMonitor, Motherborad theMotherboard) {
		super();
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherboard = theMotherboard;
	}



	public Case getTheCase() {
		return theCase;
	}



	public Monitor getTheMonitor() {
		return theMonitor;
	}



	public Motherborad getTheMotherboard() {
		return theMotherboard;
	} 
	
	
}

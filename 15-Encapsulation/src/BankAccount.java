
public class BankAccount {
	 private int number;
	 private int balance;
	 private String customerName;
	 private String email;
	 private int phone;
	 
	 
	 
	 

	public int getNumber() {
		return number;
	}




	public void setNumber(int number) {
		this.number = number;
	}




	public int getBalance() {
	
		return balance;
	}




	public void setBalance(int balance) {
		
		this.balance = balance;
		
	}




	public String getCustomerName() {
		return customerName;
	}




	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getPhone() {
		return phone;
	}




	public void setPhone(int phone) {
		this.phone = phone;
	}




	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
     public void deposit(int depositSum) {
    	
    	 this.balance   += depositSum; 
    	 
     }
     
     public void withdrow (int withdrowSum) {
    	 
    	 if (this.balance >= withdrowSum) {
    	 this.balance   = this.balance - withdrowSum;
    	 System.out.println("withdrow of" + withdrowSum + " prossed. remaining balance = " + this.balance);
    	
    	 }else {
    		 System.out.println("Only" + this.balance+ " available ");
    	 }
    	 
}


		
	}


public class AccountMaine {

	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount();
		customer1.setBalance(1000);
		customer1.setCustomerName("Mike");
		customer1.setEmail("123@gmail.com");
		customer1.setNumber(123456789);
        customer1.setPhone(571345678);
        customer1.deposit(3000);
        customer1.withdrow(2000);
        
}
 
}

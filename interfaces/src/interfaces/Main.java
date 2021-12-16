package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer salih = new Customer(1,"Salih","Sulak");
		customerManager.add(salih);
	}

}

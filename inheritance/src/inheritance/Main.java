package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer salih = new IndividualCustomer();
		salih.customerNumber="15184";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78526";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {salih,abc,hepsiBurada};
		customerManager.addMultiple(customers);
	}

}

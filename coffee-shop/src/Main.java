import java.time.LocalDate;
import abstracts.BaseCustomerManager;
import adapter.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//customerManager.save(new Customer(1, "FirstName", "LastName", LocalDate.of(year, month, day), "NationalityId"));
		System.out.println("denem");
	}

}

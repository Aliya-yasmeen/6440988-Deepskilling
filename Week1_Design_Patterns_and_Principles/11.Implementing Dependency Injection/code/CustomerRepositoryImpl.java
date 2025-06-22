// CustomerRepositoryImpl.java
import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerDatabase = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Add actual customer data here
        customerDatabase.put("C001", new Customer("C001", "Aliya Yasmeen"));
        customerDatabase.put("C002", new Customer("C002", "Safa Khan"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerDatabase.get(id);
    }
}

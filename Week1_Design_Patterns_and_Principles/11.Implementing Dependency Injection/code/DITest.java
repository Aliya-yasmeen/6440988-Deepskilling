
public class DITest {
    public static void main(String[] args) {
        // Step 1: Create the repository implementation
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Step 2: Inject into service via constructor
        CustomerService service = new CustomerService(repository);

        // Step 3: Use service
        service.displayCustomer("C001");
        service.displayCustomer("C002");
        service.displayCustomer("C999"); // Non-existent
    }
}

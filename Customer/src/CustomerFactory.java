public class CustomerFactory extends AbstractCustomer {
    private static final String[] nameCustomer = {"rob","bob","Julie"};
    static RealCustomer getCustomer(String name) {
        for (String customer : nameCustomer) {
            if (customer.equals(name)) {
                return new RealCustomer(name);
            }else {
                return new NullCustomer(true);
            }
        }
    }
}



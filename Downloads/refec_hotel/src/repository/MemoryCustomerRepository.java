package repository;

import presentation.CustomerUi;

public class MemoryCustomerRepository implements CustomerRepository {
    ///싱글톤
    private static final MemoryCustomerRepository memoryCustomerRepository = new MemoryCustomerRepository();
    public static MemoryCustomerRepository getInstance(){
        return memoryCustomerRepository;
    }


    @Override
    public void createCustomer() {

    }

    @Override
    public void readOneCustomer() {

    }

    @Override
    public void readCustomerList() {

    }

    @Override
    public void modifyCustomer() {

    }

    @Override
    public void deleteCustomer() {

    }
}

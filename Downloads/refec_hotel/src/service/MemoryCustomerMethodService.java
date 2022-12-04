package service;

import presentation.CustomerUi;

public class MemoryCustomerMethodService implements CustomerMethodService {

    ///싱글톤
    private static final MemoryCustomerMethodService memoryCustomerMethodService = new MemoryCustomerMethodService();
    public static MemoryCustomerMethodService getInstance(){
        return memoryCustomerMethodService;
    }


    @Override
    public void makingReservation() {

    }

    @Override
    public void findAllReservationOfTheCustomer() {

    }

    @Override
    public void findTheCustomerReservationByReservationDate() {

    }

    @Override
    public void findBonusPointOfCustomer() {

    }

    @Override
    public void cancelTheReservation() {

    }

    @Override
    public void modifyCustomerInformation() {

    }

    @Override
    public void signOutOfCustomer() {

    }
}

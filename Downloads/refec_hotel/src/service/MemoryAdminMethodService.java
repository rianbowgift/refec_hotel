package service;

import presentation.CustomerUi;

public class MemoryAdminMethodService implements AdminMethodService {

    ///싱글톤
    private static final MemoryAdminMethodService memoryAdminMethodService = new MemoryAdminMethodService();
    public static MemoryAdminMethodService getInstance(){
        return memoryAdminMethodService;
    }


    @Override
    public void findAllReservationList() {

    }

    @Override
    public void findTheCustomerReservationByCustomerReservationNumber() {

    }

    @Override
    public void findCustomerInformationByCustomerNameAndCustomerPhoneNumber() {

    }

    @Override
    public void cancelTheReservationByCustomerReservation() {

    }

    @Override
    public void removeCustomerInformation() {

    }

    @Override
    public void findHotelAsset() {

    }

    @Override
    public void signOut() {

    }
}

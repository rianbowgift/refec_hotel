package service;

public interface AdminMethodService {

    public void findAllReservationList();
    public void findTheCustomerReservationByCustomerReservationNumber();
    public void findCustomerInformationByCustomerNameAndCustomerPhoneNumber();
    public void cancelTheReservationByCustomerReservation();
    public void removeCustomerInformation();
    public void findHotelAsset();
    public void signOut();



}

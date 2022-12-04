package repository;

import presentation.CustomerUi;

public class MemoryReservationRepository implements ReservationRepository{
    ///싱글톤
    private static final MemoryReservationRepository memoryReservationRepository = new MemoryReservationRepository();
    public static MemoryReservationRepository getInstance(){
        return memoryReservationRepository;
    }

    @Override
    public void createReservation() {

    }

    @Override
    public void readOneReservation() {

    }

    @Override
    public void readReservationList() {

    }

    @Override
    public void modifyReservation() {

    }

    @Override
    public void deleteReservation() {

    }
}

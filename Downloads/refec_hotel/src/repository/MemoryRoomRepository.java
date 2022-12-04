package repository;

import presentation.CustomerUi;

public class MemoryRoomRepository implements RoomRepository{

    ///싱글톤
    private static final CustomerUi customerUi = new CustomerUi();
    public static CustomerUi getInstance(){
        return customerUi;
    }


    @Override
    public void createRoom() {

    }

    @Override
    public void readRoom() {

    }

    @Override
    public void readRoomList() {

    }

    @Override
    public void modifyRoom() {

    }

    @Override
    public void deleteRoom() {

    }
}

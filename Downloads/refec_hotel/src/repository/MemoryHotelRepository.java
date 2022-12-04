package repository;

import entity.Room;
import presentation.CustomerUi;

import java.util.List;

public class MemoryHotelRepository implements HotelRepository{
    ///싱글톤
    private static final MemoryHotelRepository memoryHotelRepository = new MemoryHotelRepository();
    public static MemoryHotelRepository getInstance(){
        return memoryHotelRepository;
    }



    @Override
    public List<Room> getRoomList() {
        return null;
    }

    @Override
    public void getHotelAsset() {

    }

    @Override
    public void getAdminId() {

    }

    @Override
    public void getAdminPassword() {

    }


}

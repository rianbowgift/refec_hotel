package repository;

import entity.Room;

import java.util.List;

public interface HotelRepository {


    public List<Room> getRoomList();
    public void getHotelAsset();
    public void getAdminId();
    public void getAdminPassword();




}

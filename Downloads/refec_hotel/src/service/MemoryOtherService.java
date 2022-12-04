package service;

public class MemoryOtherService implements OtherService{


    ///싱글톤
    private static final MemoryOtherService memoryOtherService = new MemoryOtherService();
    public static MemoryOtherService getInstance(){
        return memoryOtherService;
    }


    @Override
    public void validPhoneNumberCheck() {

    }

    @Override
    public void validDateFormat() {

    }
}

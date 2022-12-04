package service;

import entity.Customer;
import presentation.CustomerUi;

public class MemoryLoginService implements LoginService{

    ///싱글톤
    private static final MemoryLoginService memoryLoginService = new MemoryLoginService();
    public static MemoryLoginService getInstance(){
        return memoryLoginService;
    }


    @Override
    public int customerSignInOrAdminSignIn(String id, String password) {
        //Q.관리자를 어떤방식으로 판별?
        // 1.직접비교(id==admin ->true)
        // 2.b8식비교(id가 admin_ 으로시작하면 true)
        // 3.그외???

        // 일단은 직접비교처리
        //이부분 메소드로 각각 분리필요
        if(id.equals("admin") && password.equals("1234")){
            return 1;   //관리자 리턴
        }

        //if(유저일경우){ return 2; }
        //유저 리스트를 생성해서 for문??






        return 0;
    }

    @Override
    public void SignUp(String id,String password,String name,String number) {




    }

    @Override
    public void findCustomerInformation() {

    }
}

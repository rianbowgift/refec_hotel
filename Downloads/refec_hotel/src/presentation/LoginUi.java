package presentation;

import entity.Customer;
import repository.MemoryCustomerRepository;
import service.LoginService;
import service.MemoryLoginService;
import service.OtherService;

import java.util.Scanner;


//UI가 아니라 사실상 서비스에 가까운 느낌
public class LoginUi {

    private static AdminUi adminUi = new AdminUi();
    private static CustomerUi customerUi = new CustomerUi();
    static Scanner sc = new Scanner(System.in);

    static MemoryLoginService memoryLoginService = MemoryLoginService.getInstance();




    public void signUp(){
        System.out.println("사용하실 아이디를 입력해주세요");
        String id = sc.nextLine();
        System.out.println("사용하실 비밀번호를 입력해주세요");
        String password = sc.nextLine();
        System.out.println("성함을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("전화번호를 입력해주세요");
        String number = sc.nextLine();
        memoryLoginService.SignUp(id,password,name,number);

    }

    public void signIn(){
        System.out.println("아이디를 입력해주세요");
        String id = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();
        int userType = memoryLoginService.customerSignInOrAdminSignIn(id,password);

        //관리자일경우 1,유저면 2, 예외처리는 서비스에 진행후 반환
        if(userType==1){
            adminUi.index();
        }else if(userType==2){
            customerUi.index();
        }


    }

    public  void findCustomerInformation(){ //회원찾기
        System.out.println("회원의 이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("회원의 전화번호를 입력해주세요");
        String number = sc.nextLine();



        // Q.사용자 정보를 가지고있는게 누구???호텔? 아니면 로그인?
        // 회원 리스트가 따로 필요??
        // MemoryCustomerRepository에 유저리스트 저장 리스트 필요
    }


}

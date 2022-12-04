import entity.Customer;
import presentation.AdminUi;
import presentation.LoginUi;

import java.util.Scanner;

public class MainRoom {

    static LoginUi loginUi = new LoginUi();




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("1.로그인 2.회원가입 3.아이디찾기 4.종료\n");
            switch (sc.nextInt()) {
                // 케이스문 ->는 11버전미지원
                case 1:
                    loginUi.signIn(); //로그인
                    break;
                case 2:
                    loginUi.signUp(); //회원가입
                    break;
                case 3:
                    loginUi.findCustomerInformation();    //회원찾기
                    break;
                case 4:
                    System.exit(0);   //종료
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }



    }
}

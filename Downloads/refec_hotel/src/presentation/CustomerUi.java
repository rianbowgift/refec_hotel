package presentation;

import java.util.Scanner;

public class CustomerUi {

    ///싱글톤
    private static final CustomerUi customerUi = new CustomerUi();
    public static CustomerUi getInstance(){
        return customerUi;
    }

    public void index(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1.예약 하기 2.예약 전체 조회 3.예약일 조회\n");
            System.out.println("4.포인트 조회 5.예약 취소 6.회원 정보 수정 7.로그아웃\n");
            switch (sc.nextInt()) {
                // 케이스문 ->는 11버전미지원
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

}

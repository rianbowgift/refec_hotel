package presentation;

import java.util.Scanner;

public class AdminUi {


    ///싱글톤
    private static final AdminUi adminUi = new AdminUi();
    public static AdminUi getInstance(){
        return adminUi;
    }


    public void index(){
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("1.예약 전체 조회 2.예약번호 조회 3.고객정보 조회\n");
            System.out.println("4.고객예약 취소 5.회원삭제 6.호텔자산조회 7.로그아웃\n");
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

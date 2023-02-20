package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch case
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 4등 : 장학금 대상 아님

        // if else 문을 이용한 방법
        int ranking = 4;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking==2 || ranking==3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1 \n");

        // Switch case 이용한 방법
        ranking = 4;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // switch 문 종료
            case 2 :
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // default 명령어는 break 필요 없음
                System.out.println("장학금 지급 대상 아님");
        }
        System.out.println("조회 완료 #2 \n");


        // Switch case 2, 3 통합
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break; // switch 문 종료
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default: // default 명령어는 break 필요 없음
                System.out.println("장학금 지급 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급: 최상, 4급: 최하)
        int grade = 3;
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");
        // 3등급: 8000원

        // 언제 switch case를 쓰느냐 -> 명확한 값이 주어지는 경우
    }
}
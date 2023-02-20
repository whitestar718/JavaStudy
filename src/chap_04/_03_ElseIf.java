package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉에이드 있으면 +1
        // 또는 망고 주스 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = false; // 한라봉에이드
        boolean mangoJuice = false; // 망고주스

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1 \n");


        // -----------------------------------------------------------
        // else if 는 여러번 사용 가능
        hallabongAde = false; // 한라봉에이드
        mangoJuice = false; // 망고주스
        boolean orangeJuice = true;

        if (hallabongAde){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오렌주 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1 \n");

        // 참고로 else 는 없어도 가능
    }
}
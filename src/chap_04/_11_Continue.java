package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        int max = 20; // 최대 치킨 개수
        int sold = 0; // 현재 치킨 판매 수량
        int noshow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            sold ++;

            // 손님이 없다면?
            if (i == noshow){
                System.out.println(i+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("============================");
        int index = 0; // 손님 번호
        sold = 0; // 현재까지 판매된 치킨
        // while (index < 50) {
        while (true) {
            index ++;
            System.out.println(index+"번 손님, 주문하신 치킨 나왔습니다.");
            sold ++;

            // noShow
            if (index == noshow) {
                System.out.println(index+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
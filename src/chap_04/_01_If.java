package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문
        int hour = 15; // 오전 10시

        // 1개의 문장을 실행할 때는 {} 중괄호 생략 가능
        if (hour < 14) // 1개 문장
            System.out.println("아이스 아메리카노 +1");

        // 2개 이상 문장은 중괄호 {} 꼭 추가해야 함
        if (hour < 14) { // 2개 이상 문장
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        } // 2줄 이상이면 꼭 중괄호를 추가해줘야 한다.
        System.out.println("커피 주문 완료 #1\n");

        // 오후 2시 이전이면서 모닝커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; // 모닝커피
//        if (hour < 14 && morningCoffee == false)
        if (hour < 14 && !morningCoffee)
            System.out.println("아이스 아메리카노 +1");
        System.out.println("커피 주문 완료 #2 \n");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = false;
        // if (hour >= 14 || morningCoffee){
        if (hour >= 14 || morningCoffee == true){
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}

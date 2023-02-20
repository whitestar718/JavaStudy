package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        // 배열을 쓰는 이점이 하나도 없다. 배열의 이점을 살리려면 순회와 함께 사용해야 한다.

        System.out.println("--------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }

        System.out.println("====================");
        // 배열의 길이를 이용한 순회 (좋구만)
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]+"하나!");
        }

        // enhanced for (for-each)
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        for (String coffee : coffees) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");
        
        // foreach라고 하면 자동완성 => 그 이후에는 tab으로 이동하면됨
        for (String coffee :
                coffees) {
            System.out.println(coffee + "하나");
        }
    }
}
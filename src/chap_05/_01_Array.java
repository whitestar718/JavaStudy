package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열: 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나"); // 아메리카노 하나
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요.");

        // 배열 선언 첫 번째 방법
//        String[] coffees = new String[4]; // 크기 4의 배열을 만든 것이다.

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[4];

//        coffees[0] = "아메리카노"; // index값은 항상 0부터 시작한다.
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";
        
        // 세번째 방법
//        String[] coffes = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 네번째 방법
        String[] coffes = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("-------------------------------------");
        // 커피 주문
        System.out.println(coffes[0]+" 하나 주세요.");
        System.out.println(coffes[1]+" 하나 주세요.");
        coffes[2] = "자몽티"; // 챈들러가 갑자기 전화해서 메뉴를 바꿈
        System.out.println(coffes[2]+" 하나 주세요.");
        System.out.println(coffes[3]+" 하나 주세요.");

        // 다른 자료형도 가능함
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] {10.0, 11.1, 12.1};
        boolean[] b = {true, true, false};
    }
}

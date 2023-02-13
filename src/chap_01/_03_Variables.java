package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "은해찬"; // 문자열 변수 선언
        int hour = 15; // int 는 소문자구만..

        System.out.println(name + "님 배송이 시작됩니다. "+hour+"시에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        // double char
        double score = 90.5;
        char grade = 'A'; // 한 글짜짜리는 작은 따옴표로 해준다.
        name = "강백호"; // 이런걸 업데이트라고 한다.
        System.out.println(name+"님의 평균점수는 "+score+"점 입니다.");
        System.out.println("학점은 "+grade+"입니다.");

        // boolean
        boolean pass = true;
        System.out.println("pass or fail?"+pass);

        // float <- double 보다 정밀도는 떨어지지만 소수점을 표현할 수 있다.
        double d = 3.141234567689;
        float f = 2.14123456789f; // 반드시 소문자나 대문자로 f를 적어줘야 한다.
        System.out.println(d);
        System.out.println(f); // float 이라서 좀 잘린다.

        // long <- int 처럼 정수형 자료를 다루지만, 좀 더 긴 자료형을 다룰 수 있다.
        long l = 10000000000l; // long형 자료는 마지막에 l, L을 붙여주면 된다.
        l = 1_000_000_000_000l; // 언더바로 가독성 읽게 끊어줄 수도 있다.
        System.out.println(l);

        // int, long, float, double, char, String, boolean
    }
}

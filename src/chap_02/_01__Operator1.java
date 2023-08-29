package chap_02;

public class _01__Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5/2); // 2
        System.out.println(2/4); // 0
        System.out.println(4 % 2);// 4를 2로 나눈 나머지;
        System.out.println(5 % 2); // 1

        // 우선 순위에 따른 연산
        System.out.println(2 + 2 * 2); // 곱하기가 먼저
        System.out.println((2 + 2) * 2); // 괄효 이용

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a+b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println("---------------------");
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val++); // 11
        System.out.println(val); // 12

        val  = 10;
        System.out.println("---------------------");
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val --); // 9
        System.out.println(val); // 8

        // 은행 대기번호 표
        System.out.println("---------------------");
        int waiting = 0;
        System.out.println("대기인원: " + waiting++); // 0
        System.out.println("대기인원: " + waiting++); // 1
        System.out.println("대기인원: " + waiting++); // 2
        System.out.println("총 대기인원:" + waiting); // 총 대기인원 3
    }
}

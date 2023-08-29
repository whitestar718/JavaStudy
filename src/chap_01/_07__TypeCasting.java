package chap_01;

public class _07__TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 -> 실수형, 실수형 -> 정수형 등

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 괄호를 쓰면 형변환을 할 수 있다.
        System.out.println((double)score); // ㅇㅇ

        // float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f); // 소수점은 모두 버린다.
        System.out.println((int)score_d); // 소수점은 모두 버린다.

        // 정수와 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); // 191
        score_d = 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        // int -> long -> float => double (자동 형변환)

        int convertedScoreInt = (int) score_d;
        // double -> float -> long -> int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.9");
        System.out.println(d);

        int error = Integer.parseInt("자바");
    }
}

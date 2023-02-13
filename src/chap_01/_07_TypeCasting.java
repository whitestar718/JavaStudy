package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d); // 소수점은 벼려진다.

        // 정수 + 실수 연산
        score = 93 + (int)98.8;
        System.out.println("자동"+score); // 93 + 98

        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);
        score_d = 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);
        // 큰 그릇에 작은 놈의 연산은 가능하다. 반대는 불가능.

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동형변환)

        // int convertedScoreInt = score_d; // 191.8 -> 191
        int convertedScoreInt = (int) score_d;
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수둉 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자열으로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // 올바른 형이 아닐 때는 에러가 난다.
//        int error = Integer.parseInt("자바");
//        System.out.println(error);
    }
}

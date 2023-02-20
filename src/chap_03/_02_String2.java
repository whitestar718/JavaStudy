package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(s.indexOf("Java"))); // 인덱스 기준 7부터 시작

        //  Java 라는 글자가 시작하는 위치부터, .이 시작하는 바로 앞까지 출력
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 끝 문자는 직전까지 한다.

        //  공백을 제거
        s = "            I love Java.           ";
        System.out.println(s);
        System.out.println(s.trim()); // 불필요한 공백을 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); // concat 으로 붙여서 실행할 수도 있다.
    }
}
package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C."; // intelli J에서 밑에 글자수가 뜬다.
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("java"));

        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("java")); // -1 포함되지 않았기 때문.

        System.out.println(s.indexOf("and")); //  처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치 정보

        System.out.println(s.startsWith("I like")); // 해당 문자열로 시작하는지? -> true/false
        System.out.println(s.endsWith("."));

    }
}

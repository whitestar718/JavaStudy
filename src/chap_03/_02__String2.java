package chap_03;

public class _02__String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace("and", ","));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 언어들을 출력하는데 점은 빼고 출력

        // 공백 제거
        System.out.println("===================================");
        s = "         I love Java.          ";
        System.out.println(s);
        System.out.println(s.trim());

        // 문자열 결함
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
    }
}
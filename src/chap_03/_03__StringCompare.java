package chap_03;

public class _03__StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true
        System.out.println(s2.equals("python")); // 대소문자는 구분됨
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없음

        // 문자열 비교 심화
        System.out.println("============================");
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234"; // true
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 등호는 메모리값까지 비교해준다.

        // 딱 문자열만 비교하려면? -> equals 쓰면 된다.
    }
}

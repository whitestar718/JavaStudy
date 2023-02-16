package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        // java에서 or 연산은 ||로 표현한다.
        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        System.out.println(김치찌개 && 계란말이 && 제육볶음);

        // and 연산
        System.out.println(5 > 3 && 3 > 1); // true
        System.out.println(5 > 3 && 3 < 1); // false

        // or 연산
        System.out.println(5 > 3 || 3 > 1); // true
        System.out.println(5 > 3 || 3 < 1); // true
        System.out.println(5 < 3 || 3 < 1); // false

        // System.out.println(1 < 3 < 5); -> 안된다.

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5==3)); // true
        System.out.println(!(5==5)); // false
    }
}

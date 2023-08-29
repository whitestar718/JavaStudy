package chap_02;

public class _04__Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        System.out.println(김치찌개 && 계란말이 && 제육볶음);

        // And 연산
        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) && (3 < 1));

        // Or 연산
        System.out.println((5 > 3) || (3 > 1));
        System.out.println((5 > 3) || (3 < 1));
        System.out.println((5 < 3) || (3 < 1)); // false

        // 논리 부정 연산자 (!)
        System.out.println(!김치찌개);
        System.out.println(!(5==3));
    }
}
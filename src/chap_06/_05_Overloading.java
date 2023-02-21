package chap_06;

public class _05_Overloading {
    public static int getPower(int a) { // parameter, 매개변수
        int result = a * a;
        return result;
    }

    public static int getPower(String strNumber) { // 이름이 위와 동일함
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 -> 이름이 같은 메소드를 여러개 만드는 것을 말함.
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4"));

        // ★ 전달되는 자료형에 따라서, 파라미터의 개수에 따라서,
        // ★ 자바에서 알아서 구분해준다! 이것이 오버로딩.
        System.out.println(getPower(3, 3));
    }
}

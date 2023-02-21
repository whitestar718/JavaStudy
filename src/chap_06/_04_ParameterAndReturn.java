package chap_06;

public class _04_ParameterAndReturn {
    public static int power(int a) { // parameter, 매개변수
        int result = a * a;
        return result;
    }

    public static int powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있는 메소드
        int a = power(3);
        System.out.println(a);

        int b = powerByExp(3, 3);
        System.out.println(b);
        System.out.println(powerByExp(2, 4));
    }
}

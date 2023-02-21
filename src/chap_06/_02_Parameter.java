package chap_06;

public class _02_Parameter {

    public static void power(int a) { // parameter, 매개변수
        int result = a * a;
        System.out.println(a+"의 2제곱은 "+result+" 입니다.");
    }

    public static void powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(num+"^"+exp+"="+result);
    }
    public static void main(String[] args) {
        // 전달값, 파라미터

        // Argument, 인수
        power(2);
        power(3);
        powerByExp(2, 3);
        powerByExp(10, 0);
    }
}
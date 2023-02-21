package chap_06;

public class _06_WhenToUse {
    public static int getpower(int number) {
        // 메소드 내에서 메소드를 사용할 수 있다.
        return getpower(number, 2);
    }

    public static int getpower(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 필요 이유 -> 간단하게 재사용하기 위해 메소드를 쓴다.

        // 2의 2승을 구하기
        System.out.println(getpower(2, 2));
        
        // 3의 3승 구하기
        System.out.println(getpower(3, 3));

        // 4의 2승 구하기
        System.out.println(getpower(4, 2));

    }
}

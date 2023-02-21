package chap_06;

public class _07_VariableScope {
    // 지역번수 (변수가 선언된 지역 내에서만 사용 가능함) -> {}안에서만 사용 가능
    // 자바에선 global이 없나...?


//    public static void methodA(){
//        System.out.println(number);
//    }

    public static void methodB(){
        int result = 1; // 지역번수
    }
    public static void main(String[] args) {
        int number = 3;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i); -> 쓸 수 없다.

        {
            int j = 1;
            System.out.println((j));
        }
        }
}

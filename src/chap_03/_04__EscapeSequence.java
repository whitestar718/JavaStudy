package chap_03;

public class _04__EscapeSequence {
    public static void main(String[] args) {
        // 특수문자 (a.k.a Escape sequence)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요.");
        System.out.println("=======================");
        System.out.println("자바가\n너무\n재밌어요.");

        // 탭으로 이쁘게 정돈하기
        System.out.println("=======================");
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // 역슬래시 표현
        System.out.println("C:\\programs\\files\\java");


    }
}

package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자(escape sequence, Escape character, Special Character)

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가 \n너무 \n재밌어요"); // 위와 동일한 결과를 내놓는다.
        
        // \t는 탭 효과를 주는 특수문자
        // 해물파전 9000원
        // 김치전  8000원
        // 부추전  8000원
        System.out.println("해물파전\t\t 9000원");
        System.out.println("김치전 \t\t 8000원");
        System.out.println("부추전 \t\t 8000원");

        // 역슬래시를 표현하고 싶을 때는 \\라고 해준다.
        System.out.println("C:\\Program Files\\Java");

        // 단비가 "냐용"이라고 했어요. -> 문자열 사이의 따옴표는 \" 로 표현한다.
        System.out.println("단비가 \"야옹\" 이라고 했어요");

        // 마찬가지로 \' 도 있다.
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었다.");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었다."); // 사실 작은 따옴표를 써도 아무 상관없다.
        char c = 'a';
        c = '\''; // 작은 따옴표 하나를 변수로 할당하고자 할 때
        System.out.println(c);
    }
}

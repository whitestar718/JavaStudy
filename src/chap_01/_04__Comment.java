package chap_01;

public class _04__Comment {
    public static void main(String[] args) {
        // 코드 실행을 막기 위한 용도
        System.out.println("(10분전) 잠시후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        // System.out.println("(5분전) 잠시후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");
        
        // 코드에 설명을 적기위한 용도
        int size = 120;
        size = size + 10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 큰 신발을 구매
        System.out.println("신발 사이즈 "+ size +"으로 보여주세요.");

        // 여러줄 주석 처리하기
        /*
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        */

        // Ctrl + /  -> 단축키
        // Ctrl + Shift + / -> 여러줄 주석걸기
    }
}

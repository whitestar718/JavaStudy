package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");

        // 또다른 손님 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");

        // 만약에 인사법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");

        // 매장 이름이 바뀌었다.
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다."); // ALT -> drag 한번에 드래그해서 바꿀 수 있다.

        // 반복문 사용
        System.out.println("반복문 사용");
        for (int i = 0; i < 10; i++) {
            System.out.println("환영합니다. 코나입니다."+ i);
        }

        // 짝수만 출력 -> fori라고 해주고 엔터 치면 끝남
        // 0, 2, 4, 6, 8
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        // 홀수만 출력
        // 1, 3, 5, 7, 9
        System.out.println();
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }

        // 거꾸로 숫자 출력
        // 5, 4, 3, 2, 1
        System.out.println();
        for (int i = 5; i > 0 ; i--) {
            System.out.print(i);
        }

        // 1부터 10까지 수들의 합
        // 1 + 2 + 3 + ... + 10 = 55
        System.out.println();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println("현재까지 총합은 "+sum+" 입니다.");
        }
        System.out.println("total sum:"+sum);
    }
}
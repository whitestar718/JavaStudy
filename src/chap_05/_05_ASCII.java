package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI): 미국 표준 코드
        char c = 'A'; // 알파벳 대문자는 66부터, 소문자는 97부터 시작, 숫자는 48부터 시작
        System.out.println(c);
        System.out.println((int)c);

        c = '1';
        System.out.println(c);
        System.out.println((int)c);

        c ++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j+1);
            }
            ch ++;
        }

        // 영화관 좌석 번호 확인
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(seats3[i][j]+' ');
            }
            System.out.println();
        }
    }
}

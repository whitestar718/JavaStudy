package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)
        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
        
        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2에 접근
        System.out.println(seats[1][1] + "좌석이 내 좌석이다.");

        // C5에 접근
        System.out.println(seats[2][4] + "좌석에 접근한다.");

        // 첫줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5간
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // System.out.println(seats2[0][3]); // 인덱스에 없는 내용을 넣으면 에러가 난다.

        // 3차원 이상도 가능
        String[][][] marray = new String[][][]{
                { {}, {}, {} },
                { {}, {}, {} },
                { {}, {}, {} }
        };
    }
}
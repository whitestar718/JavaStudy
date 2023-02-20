package chap_04;

public class _07_Dowhile {
    public static void main(String[] args) {
        // Do while
        int distance = 25; // 수영장 전체 거리 25m
        int move = 0; // 현재 이동거리 0m
        int height = 2; // 2m

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: "+ move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        // 키가 엄청나게 큰 사람 -> 반복문이 한 번도 실행되지 않고 끝남
        System.out.println("---------반복문 #1--------");
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: "+ move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        // Do while 반복문 -> do를 쓰면 먼저 괄호 안이 먼저 수행된다.
        System.out.println("---------반복문 #2--------");
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다. move:" + move);

    }
}
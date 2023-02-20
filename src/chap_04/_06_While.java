package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        while (distance > move) { // 현재 이동 거리가 전체 이동거리보다 작다는 조건이 참인 동안
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리는 :" + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착하였습니다.");

        // 무한 루프
        move = 0;
        while (distance > move) { // 현재 이동 거리가 전체 이동거리보다 작다는 조건이 참인 동안
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리는 :" + move);
        }
        System.out.println("도착하였습니다.");
    }
}
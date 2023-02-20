package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 키가 120cm 이상인 경우에만 탑승 가능
        // 삼항연산자 이용할 것

        int child1 = 110;
        int child2 = 130;

        String ride1 = child1 >= 120 ? "가능" : "불가능";
        String ride2 = child2 >= 120 ? "가능" : "불가능";

        System.out.println("키가 "+child1+" 이므로 탑승 "+ride1+"합니다.");
        System.out.println("키가 "+child2+" 이므로 탑승 "+ride2+"합니다.");
    }
}

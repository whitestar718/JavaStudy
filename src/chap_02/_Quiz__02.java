package chap_02;

public class _Quiz__02 {
    public static void main(String[] args) {
        int height = 110;
        String s = (height >= 120) ? ("이므로 탑승 가능합니다.") : ("cm 이므로 탑승 불가능합니다.");
        System.out.println("키가 "+height+s);
    }
}
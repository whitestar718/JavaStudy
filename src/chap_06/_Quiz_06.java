package chap_06;

public class _Quiz_06 {

    public static String getHiddenData(String s, int a) {
        String rst = "";
        for (int i = 0; i < (s.length()-a); i++) {
            rst += "*";
        }
        return s.substring(0, a) + rst;
    }
    public static void main(String[] args) {
        String name = "은해찬"; // 이름
        String id = "9901001-1234567"; // 주민등록번호
        String phone = "010-4423-2312"; // 전화번호

        System.out.println("이름 : "+ getHiddenData(name, 1)); // 개인정보, 비공개 시작위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}

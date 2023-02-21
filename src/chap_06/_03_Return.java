package chap_06;

public class _03_Return {
    // void는 반환값이 없음을 의미
    // void 대신에 return 값이 있으면, 그 return 값의 데이터타입을 넣어주면 됨!


    // 호텔 전화번호, 호텔 주소, 액티비티
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-4567";
        return phoneNumber;
    }

    public static String getAddress(){
        return "경기도 의왕시 오전동 32-4";
    }

    public static String getActivity(){
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {
        // 반환값 (이거만하고 양치하러 가자)
        String pNum = getPhoneNumber();
        String Address = getAddress();
        String activity = getActivity();

        System.out.println("호텔 전화번호: "+pNum);
        System.out.println("호텔 주소: "+Address);
        System.out.println("놀거리: "+activity);
    }
}

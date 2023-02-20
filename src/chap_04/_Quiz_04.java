package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; // 주차 시간
        String car = "장애인";
        int fee = 0;

        while (hour > 0) {
            fee += 4000;
            if (fee > 30000) {
                fee = 30000;
                break;
            }
            hour --;
        }

        if (car == "일반"){
            System.out.println(car+" 차량입니다. 요금은 "+fee+"원 입니다.");
        } else {
            fee /= 2;
            System.out.println(car+" 차량입니다. 요금은 "+fee+"원 입니다.");
        }

    }
}

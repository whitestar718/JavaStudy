package chap_01;

public class _03__Variables {
    public static void main(String[] args) {
        String name = "은해찬";
        int hour = 15;
        System.out.println(name+"님 배송이 시작됩니다. "+hour+"시에 방문 예정입니다.");
        System.out.println(name+"님 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name+"님의 평균 점수는 "+score+"점 입니다.");
        System.out.println("학점은 "+grade+"입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? "+pass);

        double d = 3.14123456789;
        float f = 3.14123456789f; // 대문자로 F 적어도 상관없다.
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l = 1_000_000_000_000l;
        System.out.println(l);
    }
}

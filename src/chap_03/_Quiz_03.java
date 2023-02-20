package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String n1 = "901231-1234567";
        String n2 = "030708-4567890";

        System.out.println(n1.substring(0, n1.indexOf('-')+2));
        System.out.println(n2.substring(0, n2.indexOf('-')+2));
    }
}
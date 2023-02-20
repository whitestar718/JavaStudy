package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        int index = 0;
        for (int i = 250; i < 300; i += 5) {
            size[index] = i;
            index ++;
        }

        for (int sizeO :
                size) {
            System.out.println("사이즈 "+sizeO+" (재고 있음)");

        }
    }
}

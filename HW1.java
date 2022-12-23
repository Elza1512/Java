import java.util.Random;
public class HW1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[1];
        for (int i = 0; i <= 0; i++) {
            ints[i] = random.nextInt(2000);
        }
        for (int i : ints) {
            System.out.println(i);
        }
    }
}

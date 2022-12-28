import java.util.Random;
public class HW1 {
    public static void rand(String[] args) {
        Random random = new Random();
        int[] ints = new int[1];
        for (int i = 0; i <= 0; i++) {
            ints[i] = random.nextInt(2000);
        }
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static void bit(String[] args) {
    }

    int bit1(int n) {
        int t = 1 << 30;
        while (n < t) t >>= 1;
        return t;
    }
    public static void max(String[] args) {
        int[] ints = new int[1];
        int max_s = Short.MAX_VALUE;
        for (int j = i; j <= max_s; j++) {
            if (j % n != 0) {
                int m1 = j;
            }

        }
    }
    public static void min(String[] args) {
        int[] ints = new int[1];
        int min_s = Short.MIN_VALUE;
        for (int j = i; j <= min_s; j++) {
            if (j % n != 0) {
                int m2 = j;
            }
        }
    }
}
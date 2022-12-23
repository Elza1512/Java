import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {
        int a = 6;
        double d = 5;
        float f = 4.2f;
        long l = 34;
        short s = 2;
        byte b = 12;
        boolean bool = true;

        char ch = 'p';
        ch = 12;

        String str = "Hello";
        String str2 = new String("hbjhb");
        System.out.println("Hello");
        System.out.println("65");
        int[] ints = new int[10];
        ints[4] = ints[1] = 6;

        int ap = 0;

        Random random = new Random();

        for (int i = 0; i < 10; i++, ap++) {
            ints[i] = random.nextInt(1269);
        }
        for (int i: ints) {
            System.out.println(i);
        }
        if (a <= 9) {
            a = 2;
        } else if (a > 10) {
            a = 10;
        } else {
            a = 0;
        }
    }

    private static int add1(int n) {
        return n++;
    }
}


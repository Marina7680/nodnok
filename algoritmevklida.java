import java.util.Scanner;

public class algoritmevklida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a first number");
        long num = scanner.nextLong();
        System.out.print("Input a second number");
        long num2 = scanner.nextLong();
        long n = num;
        long m = num2;
        while (n != m) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
            }

        System.out.println("NOD=" + m);
        System.out.println("NOK="+ (num * num2) / n);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class mnoziteli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Input a first number");
        long num = scanner.nextLong();
        System.out.println("Input a second number");
        long num2 = scanner.nextLong();
        int div = 2;
        long nod = 1;
        long n = num;
        long m = num2;
        while (n != 1) {
            if (n % div == 0){
                 if (m % div == 0) {
                nod=nod*div;
                n /= div;
                m /= div;
                } else{
                    n /= div;
                      }
             }
            else div++;
        }
        System.out.println("Nod=" +nod );
        System.out.println("NOK="+ (num * num2) / nod);

    }
}

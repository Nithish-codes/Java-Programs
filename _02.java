package programs;
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        
        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        scan.close();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

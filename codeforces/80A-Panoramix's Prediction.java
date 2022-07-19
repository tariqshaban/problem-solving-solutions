// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
    static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primeNumber = sc.nextInt();
        int testNextPrimeNumber = sc.nextInt();
         if (!isPrime(testNextPrimeNumber)) {
            System.out.println("NO");
            return;
        }
         for (int i = primeNumber + 1; i < testNextPrimeNumber; i++) {
            if (isPrime(i)) {
                System.out.println("NO");
                return;
            }
        }
         System.out.println("YES");
    }
}
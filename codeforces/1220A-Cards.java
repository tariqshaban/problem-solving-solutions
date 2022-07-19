// Time in milliseconds: 280

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        int numberOfZeros = 0;
        int numberOfOnes = 0;
         for (char character : sc.next().toCharArray()) {
            if (character == 'z') {
                numberOfZeros++;
            } else if (character == 'n') {
                numberOfOnes++;
            }
        }
         for (int i = 0; i < numberOfOnes; i++) {
            System.out.print("1 ");
        }
         for (int i = 0; i < numberOfZeros; i++) {
            System.out.print("0 ");
        }
    }
}
// Time in milliseconds: 372

import java.util.Scanner;
 import static java.lang.Math.ceil;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numbersLength = sc.nextLong();
        long specifiedIndex = sc.nextLong();
         if (specifiedIndex <= ceil(numbersLength / 2.0)) {
            System.out.println(specifiedIndex * 2 - 1);
        } else {
            System.out.println((long) (specifiedIndex - ceil(numbersLength / 2.0)) * 2);
        }
    }
}
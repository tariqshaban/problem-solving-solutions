// Time in milliseconds: 327

import java.util.Scanner;
 import static java.lang.Math.ceil;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int numberOfBlocks = sc.nextInt();
             int firstPlace = (int) ceil(numberOfBlocks / 3.0) + 1;
            int thirdPlace = numberOfBlocks / 3 - 1;
            int secondPlace = numberOfBlocks - firstPlace - thirdPlace;
             System.out.println(secondPlace + " " + firstPlace + " " + thirdPlace);
        }
    }
}
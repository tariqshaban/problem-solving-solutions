// Time in milliseconds: 202

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfParticipants = sc.nextInt();
        int numberOfPens = sc.nextInt();
        int numberOfNotebooks = sc.nextInt();
         if (numberOfParticipants <= min(numberOfPens, numberOfNotebooks)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
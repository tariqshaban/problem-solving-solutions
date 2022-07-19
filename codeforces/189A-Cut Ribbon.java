// Time in milliseconds: 233

import java.util.Scanner;
 import static java.lang.Math.max;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLength = sc.nextInt();
        int firstAcceptedLength = sc.nextInt();
        int secondAcceptedLength = sc.nextInt();
        int thirdAcceptedLength = sc.nextInt();
        int counter = 0;
         for (int i = 0; i * firstAcceptedLength <= totalLength; ++i)
            for (int j = 0; i * firstAcceptedLength + j * secondAcceptedLength <= totalLength; ++j) {
                int remainder = totalLength - i * firstAcceptedLength - j * secondAcceptedLength;
                if (remainder % thirdAcceptedLength == 0) {
                    int answer = remainder / thirdAcceptedLength;
                    counter = max(counter, i + j + answer);
                }
            }
         System.out.println(counter);
    }
}
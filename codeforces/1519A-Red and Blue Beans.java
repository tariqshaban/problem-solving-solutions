// Time in milliseconds: 218

import java.util.Scanner;
import static java.lang.Math.*;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int redBeans = sc.nextInt();
            int blueBeans = sc.nextInt();
            int threshold = sc.nextInt();
             int difference = (int) ceil(abs(redBeans - blueBeans) * 1.0 / min(redBeans, blueBeans));
            if (difference <= threshold) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
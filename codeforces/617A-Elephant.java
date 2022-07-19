// Time in milliseconds: 187

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        int steps = 0;
         while(point>0){
            int applicableStep = min(point, 5);
             steps += point / applicableStep;
            point -= steps * applicableStep;
        }
         System.out.println(steps);
    }
}
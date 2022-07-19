// Time in milliseconds: 280

import java.util.Scanner;
 import static java.lang.Math.max;
import static java.lang.Math.min;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();
             if(width>height){
                int temp = width;
                width = height;
                height = temp;
            }
             System.out.println(max(width*2,height)*max(width*2,height));
        }
    }
}
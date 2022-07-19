// Time in milliseconds: 374

import java.util.Scanner;
 import static java.lang.Math.abs;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                number = sc.nextInt();
                if(number==1){
                    int rowDistance = abs(2-i);
                    int colDistance = abs(2-j);
                     System.out.println(rowDistance + colDistance);
                     return;
                }
            }
        }
    }
}
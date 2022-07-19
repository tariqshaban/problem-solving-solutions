// Time in milliseconds: 280

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfEvents = sc.nextInt();
         int capacity = 0;
        int result = 0;
         for (int i = 0; i < numberOfEvents; i++) {
            int event = sc.nextInt();
             if (event > 0) {
                capacity += event;
            } else if (event == -1) {
                capacity--;
            }
             if (capacity < 0 && event == -1) {
                result++;
                capacity = 0;
            }
        }
         System.out.println(result);
    }
}
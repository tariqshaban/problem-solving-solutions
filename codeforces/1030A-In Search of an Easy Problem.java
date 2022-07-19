// Time in milliseconds: 171

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
         for (int i = 0; i < numberOfPeople; i++) {
            int response = sc.nextInt();
            if (response == 1) {
                System.out.println("HARD");
                return;
            }
        }
         System.out.println("EASY");
    }
}
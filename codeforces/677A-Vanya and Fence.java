// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        int fenceHeight = sc.nextInt();
        int result = 0;
         for (int i = 0; i < numberOfFriends; i++) {
            int friendHeight = sc.nextInt();
            if (friendHeight > fenceHeight) {
                result += 2;
            } else {
                result++;
            }
        }
         System.out.println(result);
    }
}
// Time in milliseconds: 404

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        sc.nextLine();
        ArrayList<String> giftAssignments = new ArrayList<>(List.of(sc.nextLine().split(" ")));
        ArrayList<Integer> result = new ArrayList<>();
         for (int i = 0; i < numberOfFriends; i++) {
            result.add(giftAssignments.indexOf(Integer.toString(i + 1)) + 1);
        }
         for (int number : result) {
            System.out.print(number + " ");
        }
    }
}
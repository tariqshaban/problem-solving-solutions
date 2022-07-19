// Time in milliseconds: 280

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> candiesInBox = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int result = 0;
             for (int j = 0; j < length; j++) {
                candiesInBox.add(sc.nextInt());
            }
             int minCandy = Collections.min(candiesInBox);
             for (int candy : candiesInBox) {
                result += candy - minCandy;
            }
             System.out.println(result);
             candiesInBox.clear();
        }
    }
}
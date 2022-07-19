// Time in milliseconds: 904

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int listLength = sc.nextInt();
             for (int j = 0; j < listLength; j++) {
                list.add(sc.nextInt());
            }
             Collections.sort(list);
             System.out.println(list.getLast() - list.getFirst());
            list.clear();
        }
    }
}
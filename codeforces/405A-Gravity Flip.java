// Time in milliseconds: 202

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfColumns = sc.nextInt();
        LinkedList<Integer> columns = new LinkedList<>();
         for (int i = 0; i < numberOfColumns; i++) {
            columns.add(sc.nextInt());
        }
         Collections.sort(columns);
         for (int column : columns) {
            System.out.print(column + " ");
        }
    }
}
// Time in milliseconds: 202

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tableSize = sc.nextInt();
        LinkedList<LinkedList<Integer>> matrix = new LinkedList<>();
         for (int i = 0; i < tableSize; i++) {
            matrix.add(new LinkedList<>());
            for (int j = 0; j < tableSize; j++) {
                if (i == 0 || j == 0) {
                    matrix.get(i).add(1);
                } else {
                    int number = matrix.get(i - 1).get(j) + matrix.get(i).get(j - 1);
                    matrix.get(i).add(number);
                }
            }
        }
         LinkedList<Integer> lastRow = matrix.get(matrix.size() - 1);
        System.out.println(lastRow.get(lastRow.size() - 1));
    }
}
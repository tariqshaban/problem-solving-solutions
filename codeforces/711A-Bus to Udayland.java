// Time in milliseconds: 217

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        LinkedList<String> rows = new LinkedList<>();
        int availableRowIndex = -1;
         for (int i = 0; i < numberOfRows; i++) {
            rows.add(sc.next());
            if (rows.getLast().contains("OO")) {
                availableRowIndex = i;
            }
        }
         if (availableRowIndex >= 0) {
            System.out.println("YES");
             for (int j = 0; j < rows.size(); j++) {
                if (j == availableRowIndex) {
                    rows.set(j, rows.get(j).replaceFirst("OO", "++"));
                }
                System.out.println(rows.get(j));
            }
        } else {
            System.out.println("NO");
        }
    }
}
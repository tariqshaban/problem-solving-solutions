// Time in milliseconds: 171

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        StringBuilder filename = new StringBuilder();
        int numberOfDeletions = 0;
         filename.append(sc.next());
         while (filename.toString().contains("xxx")) {
            int index = filename.indexOf("xxx");
            filename.deleteCharAt(index);
            numberOfDeletions++;
        }
         System.out.println(numberOfDeletions);
    }
}
// Time in milliseconds: 202

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> books = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int counter = 0;
             for (int j = 0; j < length; j++) {
                books.add(sc.nextInt());
            }
             while (books.getFirst() == 0) {
                books.remove(0);
            }
             while (books.getLast() == 0) {
                books.remove(books.size() - 1);
            }
             for (int book : books) {
                if (book == 0) {
                    counter++;
                }
            }
             System.out.println(counter);
            books.clear();
        }
    }
}
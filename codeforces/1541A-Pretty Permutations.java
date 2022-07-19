// Time in milliseconds: 218

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> positions = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int numberOfCats = sc.nextInt();
             for (int j = 1; j <= numberOfCats; j++) {
                int position;
                 if (j == numberOfCats && j % 2 != 0) {
                    position = j;
                } else if (j % 2 == 0) {
                    position = j - 1;
                } else {
                    position = j + 1;
                }
                 positions.add(position);
            }
             if (positions.size() % 2 != 0) {
                int temp = positions.get(positions.size() - 2);
                positions.set(positions.size() - 2, positions.getLast());
                positions.set(positions.size() - 1, temp);
            }
             for (int position : positions) {
                System.out.print(position + " ");
            }
            System.out.println();
             positions.clear();
        }
    }
}
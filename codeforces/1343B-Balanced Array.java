// Time in milliseconds: 920

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int number = sc.nextInt();
            int evenTotal = 0;
            int oddTotal = 0;
             if (number / 2 % 2 != 0) {
                System.out.println("NO");
                continue;
            }
             for (int j = 1; j <= number / 2; j++) {
                even.add(j * 2);
                evenTotal += j * 2;
            }
             for (int j = 1; j <= number / 2; j++) {
                odd.add(j * 2 - 1);
                oddTotal += j * 2 - 1;
            }
             oddTotal -= odd.get(odd.size() - 1);
            odd.remove(odd.size() - 1);
            odd.add(evenTotal - oddTotal);
             System.out.println("YES");
            for (int evenNumber : even) {
                System.out.print(evenNumber + " ");
            }
            for (int oddNumber : odd) {
                System.out.print(oddNumber + " ");
            }
            System.out.println();
             even.clear();
            odd.clear();
        }
    }
}
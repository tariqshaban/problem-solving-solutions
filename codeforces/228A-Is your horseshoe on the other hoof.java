// Time in milliseconds: 374

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> uniqueColors = new LinkedHashSet<>();
         for (int i = 0; i < 4; i++) {
            uniqueColors.add(sc.nextInt());
        }
         System.out.println(4 - uniqueColors.size());
    }
}
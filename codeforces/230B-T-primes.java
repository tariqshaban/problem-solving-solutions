// Time in milliseconds: 1964

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long[] a = new long[number];
        for (int i = 0; i < number; i++) a[i] = sc.nextLong();
         boolean[] p = new boolean[1000001];
        p[0] = false;
        p[1] = false;
        p[2] = true;
        for (int i = 3; i < p.length; i += 2) p[i] = true;
         for (int i = 3; i < p.length; i += 2) {
            if (p[i]) {
                for (int j = 3 * i; j < p.length; j += 2 * i) p[j] = false;
            }
        }
        Set<Long> hs = new HashSet<>();
        hs.add(4L);
        for (int i = 3; i < p.length; i += 2) {
            if (p[i]) hs.add((long) i * i);
        }
        for (int i = 0; i < number; i++) {
            if (hs.contains(a[i])) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
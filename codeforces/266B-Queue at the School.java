// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int interval = sc.nextInt();
        StringBuilder queue = new StringBuilder();
         queue.append(sc.next());
         for (int i = 0; i < interval; i++) {
            for (int j = 1; j < queue.length(); j++) {
                if (queue.charAt(j - 1) == 'B' && queue.charAt(j) == 'G') {
                    queue.setCharAt(j - 1, 'G');
                    queue.setCharAt(j, 'B');
                    j++;
                }
            }
        }
         System.out.println(queue);
    }
}
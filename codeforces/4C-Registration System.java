// Time in milliseconds: 2152

import java.util.HashMap;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfRequests = sc.nextInt();
        HashMap<String, Integer> names = new HashMap<>();
         for (int i = 0; i < numberOfRequests; i++) {
            String name = sc.next();
             if (names.containsKey(name)) {
                names.put(name, names.get(name) + 1);
                System.out.println(name + (names.get(name) - 1));
            } else {
                names.put(name, 1);
                System.out.println("OK");
            }
        }
    }
}
// Time in milliseconds: 171

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<String> list = new LinkedList<>();
        HashMap<String, Integer> occurrences = new HashMap<>();
         for (int i = 0; i < numberOfCases; i++) {
            int arrayLength = sc.nextInt();
            for (int j = 0; j < arrayLength; j++) {
                String number = sc.next();
                list.add(number);
                if (occurrences.containsKey(number)) {
                    occurrences.put(number, occurrences.get(number) + 1);
                } else {
                    occurrences.put(number, 1);
                }
            }
             for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(list.indexOf(entry.getKey()) + 1);
                    break;
                }
            }
             list.clear();
            occurrences.clear();
        }
    }
}
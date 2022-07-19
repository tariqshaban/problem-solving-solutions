// Time in milliseconds: 608

import java.util.*;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> numbers = new LinkedList<>();
        Map<Integer, Integer> occurrences = new HashMap<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            boolean isFound = false;
            for (int j = 0; j < length; j++) {
                int input = sc.nextInt();
                numbers.add(input);
                if (occurrences.containsKey(input)) {
                    occurrences.put(input, occurrences.get(input) + 1);
                } else {
                    occurrences.put(input, 1);
                }
            }
             Map<Integer, Integer> sortedOccurrences = new TreeMap<>(occurrences);
            for (Map.Entry<Integer, Integer> entry : sortedOccurrences.entrySet()) {
                if (entry.getValue() == 1) {
                    isFound = true;
                    System.out.println(numbers.indexOf(entry.getKey()) + 1);
                    break;
                }
            }
             if (!isFound) {
                System.out.println(-1);
            }
             numbers.clear();
            occurrences.clear();
        }
    }
}
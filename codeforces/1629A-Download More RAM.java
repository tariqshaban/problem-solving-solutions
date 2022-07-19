// Time in milliseconds: 218

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> memoryRequired = new LinkedList();
        LinkedList<Integer> memoryProvided = new LinkedList();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
            int currentMemory = sc.nextInt();
             for (int j = 0; j < length; j++) {
                memoryRequired.add(sc.nextInt());
            }
            for (int j = 0; j < length; j++) {
                memoryProvided.add(sc.nextInt());
            }
              while (!memoryRequired.isEmpty()) {
                int minimumRequiredMemory = Collections.min(memoryRequired);
                int minimumRequiredMemoryIndex = memoryRequired.indexOf(minimumRequiredMemory);
                 if (minimumRequiredMemory > currentMemory) {
                    break;
                } else {
                    currentMemory += memoryProvided.get(minimumRequiredMemoryIndex);
                    memoryRequired.remove(minimumRequiredMemoryIndex);
                    memoryProvided.remove(minimumRequiredMemoryIndex);
                }
            }
             System.out.println(currentMemory);
             memoryRequired.clear();
            memoryProvided.clear();
        }
    }
}
// Time in milliseconds: 233

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Character> tasks = new LinkedList<>();
        LinkedList<Character> finishedTasks = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            boolean isSuspicious = false;
             sc.nextInt();
             String tasksString = sc.next();
             for (char task : tasksString.toCharArray()) {
                tasks.add(task);
            }
             if (tasks.isEmpty()) {
                System.out.println("YES");
                tasks.clear();
                continue;
            }
             for (int j = 1; j < tasks.size(); j++) {
                if (finishedTasks.contains(tasks.get(j))) {
                    isSuspicious = true;
                    break;
                }
                 if (!tasks.get(j - 1).equals(tasks.get(j))) {
                    finishedTasks.add(tasks.get(j - 1));
                }
            }
             if(isSuspicious) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
             }
             tasks.clear();
            finishedTasks.clear();
        }
     }
}
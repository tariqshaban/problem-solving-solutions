// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         boolean didProduceOutput = false;
        for (char instruction : sc.next().toCharArray()) {
            if (instruction == 'H' || instruction == 'Q' || instruction == '9') {
                didProduceOutput = true;
                break;
            }
        }
         System.out.println(didProduceOutput ? "YES" : "NO");
    }
}
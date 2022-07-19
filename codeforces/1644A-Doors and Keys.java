// Time in milliseconds: 171

import java.util.HashMap;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        HashMap<Character, Boolean> doors = new HashMap<>();
         for (int i = 0; i < numberOfCases; i++) {
            boolean isStuck = false;
             doors.put('R', false);
            doors.put('G', false);
            doors.put('B', false);
             for (char character : sc.next().toCharArray()) {
                if (character == 'r') {
                    doors.put('R', true);
                } else if (character == 'g') {
                    doors.put('G', true);
                } else if (character == 'b') {
                    doors.put('B', true);
                } else if (Boolean.FALSE.equals(doors.get(character))) {
                    isStuck = true;
                }
            }
             if(isStuck){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
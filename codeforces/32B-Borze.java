// Time in milliseconds: 374

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> input = new LinkedList<>();
        LinkedList<Character> result = new LinkedList<>();
         for (char character : sc.next().toCharArray()) {
            input.add(character);
        }
         while (!input.isEmpty()) {
            if (input.get(0) == '.') {
                result.add('0');
                input.remove(0);
            } else if (input.get(1) == '.') {
                result.add('1');
                input.remove(0);
                input.remove(0);
            } else {
                result.add('2');
                input.remove(0);
                input.remove(0);
            }
        }
         for(char digit : result){
            System.out.print(digit);
        }
    }
}
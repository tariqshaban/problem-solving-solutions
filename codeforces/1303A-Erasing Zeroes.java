// Time in milliseconds: 186

import java.util.LinkedList;
import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Character> characters = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int counter = 0;
             for (Character character : sc.next().toCharArray()) {
                characters.add(character);
            }
             int firstOneOccurrence = characters.indexOf('1');
            int lastOneOccurrence = characters.lastIndexOf('1');
             if (firstOneOccurrence == -1) {
                System.out.println(0);
            } else {
                for (Character character : characters.subList(firstOneOccurrence, lastOneOccurrence)) {
                    if(character=='0'){
                        counter++;
                    }
                }
                 System.out.println(counter);
            }
             characters.clear();
        }
    }
}
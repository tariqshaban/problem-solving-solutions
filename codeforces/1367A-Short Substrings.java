// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        StringBuilder result = new StringBuilder();
         for (int i = 0; i < numberOfCases; i++) {
            char[] word = sc.next().toCharArray();
             result.append(word);
             if(result.length()==2){
                System.out.println(result);
                result = new StringBuilder();
                continue;
            }
             for (int j = result.length() - 2; j >= 2; j -= 2) {
                result.deleteCharAt(j);
            }
             System.out.println(result);
            result = new StringBuilder();
        }
    }
}
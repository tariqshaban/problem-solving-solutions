// Time in milliseconds: 187

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCubes = sc.nextInt();
        int height = 1;
        int previousReduction = 1;
         while (true) {
            numberOfCubes -= previousReduction;
            previousReduction += height + 1;
              if (numberOfCubes >= 0) {
                height++;
            } else {
                break;
            }
        }
         System.out.println(height - 1);
    }
}
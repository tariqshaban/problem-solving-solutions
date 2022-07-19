// Time in milliseconds: 372

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSoldiers = sc.nextInt();
        List<Integer> heights = new LinkedList<>();
         for (int i = 1; i <= numberOfSoldiers; i++) {
            heights.add(sc.nextInt());
        }
         int max = heights.get(0);
        int min = heights.get(0);
         for (int height : heights) {
            if (height > max) {
                max = height;
            }
            if (height < min) {
                min = height;
            }
        }
         int maxPosition = heights.indexOf(max);
        int minPosition = heights.lastIndexOf(min);
         int compensation = 0;
         if(maxPosition>minPosition){
            compensation = 1;
        }
         System.out.println(maxPosition + (heights.size() - minPosition) - compensation - 1);
    }
}
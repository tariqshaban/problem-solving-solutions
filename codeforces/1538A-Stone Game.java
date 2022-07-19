// Time in milliseconds: 217

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.abs;
import static java.lang.Math.min;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        LinkedList<Integer> stones = new LinkedList<>();
         for (int i = 0; i < numberOfCases; i++) {
            int length = sc.nextInt();
             for (int j = 0; j < length; j++) {
                stones.add(sc.nextInt());
            }
             int maxStone = Collections.max(stones);
            int minStone = Collections.min(stones);
             int maxStoneIndex = stones.indexOf(maxStone);
            int minStoneIndex = stones.indexOf(minStone);
             int maxStoneNearestEdgeIndex = maxStoneIndex;
            int minStoneNearestEdgeIndex = minStoneIndex;
             if (maxStoneNearestEdgeIndex >= length / 2) {
                maxStoneNearestEdgeIndex = length - maxStoneNearestEdgeIndex - 1;
            }
            if (minStoneNearestEdgeIndex >= length / 2) {
                minStoneNearestEdgeIndex = length - minStoneNearestEdgeIndex - 1;
            }
             int result;
            if (minStoneNearestEdgeIndex < maxStoneNearestEdgeIndex) {
                result = minStoneNearestEdgeIndex;
                result += min(abs(maxStoneIndex - minStoneIndex), maxStoneNearestEdgeIndex + 1);
             } else {
                result = maxStoneNearestEdgeIndex;
                result += min(abs(maxStoneIndex - minStoneIndex), minStoneNearestEdgeIndex + 1);
            }
             System.out.println(result + 1);
            stones.clear();
        }
    }
}
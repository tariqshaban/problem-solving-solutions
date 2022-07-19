// Time in milliseconds: 405

import java.util.LinkedList;
import java.util.Scanner;
 import static java.lang.Math.*;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         LinkedList<Long> squares = new LinkedList<>();
        LinkedList<Long> cubes = new LinkedList<>();
         for (int i = 1; ; i++) {
            long number = (long) pow(i, 2);
            if (number > 1000000000) {
                break;
            }
            squares.add(number);
        }
        for (int i = 1; ; i++) {
            long number = (long) pow(i, 3);
            if (number > 1000000000) {
                break;
            }
            cubes.add(number);
        }
         for (int i = 1; i < cubes.size(); i++) {
            squares.remove(cubes.get(i));
        }
         for (int i = 0; i < numberOfCases; i++) {
            long number = sc.nextLong();
             long nearestSquare = (long) pow(floor(sqrt(number)), 2);
            long nearestCube = (long) pow(floor(cbrt(number)), 3);
             int squareIndex = squares.indexOf(nearestSquare);
            int cubeIndex = cubes.indexOf(nearestCube);
             while (squareIndex == -1) {
                nearestSquare = (long) pow(floor(sqrt(--number)), 2);
                squareIndex = squares.indexOf(nearestSquare);
            }
             System.out.println(squareIndex + cubeIndex + 1);
        }
    }
}
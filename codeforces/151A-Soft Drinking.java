// Time in milliseconds: 374

import java.util.Scanner;
 import static java.lang.Math.min;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        int numberOfBottles = sc.nextInt();
         int millilitres = sc.nextInt();
        int numberOfLimes = sc.nextInt();
        int numberOfLimesSlices = sc.nextInt();
        int gramsOfSalt = sc.nextInt();
         int minimumMillilitres = sc.nextInt();
        int minimumNumberOfLimesSlices = 1;
        int minimumGramsOfSalt = sc.nextInt();
         int numberOfToastsByMillilitres = numberOfBottles * millilitres / minimumMillilitres;
        int numberOfToastsByLimes = numberOfLimes * numberOfLimesSlices / minimumNumberOfLimesSlices;
        int numberOfToastsBySalt = gramsOfSalt / minimumGramsOfSalt;
         System.out.println(min(numberOfToastsByMillilitres, min(numberOfToastsByLimes, numberOfToastsBySalt)) / numberOfFriends);
     }
}
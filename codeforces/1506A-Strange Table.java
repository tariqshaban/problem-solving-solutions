// Time in milliseconds: 296

import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
         for (int i = 0; i < numberOfCases; i++) {
            long rowNumber = Long.parseUnsignedLong(sc.next());
            long columnNumber = Long.parseUnsignedLong(sc.next());
            long cellNumber = Long.parseUnsignedLong(sc.next());
             long cellRowIndex = (cellNumber - 1) % rowNumber + 1;
            long cellColumnIndex = (cellNumber - cellRowIndex) / rowNumber + 1;
             System.out.println((cellRowIndex-1) * columnNumber + cellColumnIndex);
          }
    }
}
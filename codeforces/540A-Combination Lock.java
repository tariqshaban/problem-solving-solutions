// Time in milliseconds: 218

import java.util.Scanner;
 public class Answer{
   public static void main(String[] args) {
    int digits, moves = 0, currentMove = 0;
    String origin, target;
    Scanner s = new Scanner(System.in);
    digits = s.nextInt();
    origin = s.next();
    target = s.next();
     if (origin.length() != target.length()) {
      System.out.println("Invalid");
      return;
    }
     for (int i = 0; i < origin.length(); i++) {
      currentMove =
          Math.abs(
              Integer.parseInt(origin.charAt(i) + "") - Integer.parseInt(target.charAt(i) + ""));
      if (currentMove > 5) currentMove = 10 - currentMove;
      moves += currentMove;
    }
     System.out.println(moves);
  }
}
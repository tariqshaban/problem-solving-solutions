// Time in milliseconds: 374

import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfShapes = sc.nextInt();
        int faces = 0;
         for (int i = 0; i < numberOfShapes; i++) {
            String shape = sc.next();
            if (shape.equals("Tetrahedron")) {
                faces += 4;
            } else if (shape.equals("Cube")) {
                faces += 6;
            } else if (shape.equals("Octahedron")) {
                faces += 8;
            } else if (shape.equals("Dodecahedron")) {
                faces += 12;
            } else if (shape.equals("Icosahedron")) {
                faces += 20;
            }
        }
         System.out.println(faces);
    }
}
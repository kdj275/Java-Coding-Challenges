package CodingChallenge1;

import java.util.Scanner;

public class TriangleArea {
    private float area;
    private float height;
    private float length;

    public float calculateArea() {
        Scanner input = new Scanner(System.in);;

        System.out.println("Enter the height of the triangle: ");
        height = input.nextFloat();
        System.out.println("Enter the length of the triangle: ");
        length = input.nextFloat();
        input.close();

        area = (length * height) / 2;
        return area;
    }
}

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        String triangleType = determineTriangleType(side1, side2, side3);
        System.out.println("Triangle type: " + triangleType);
    }

    public static String determineTriangleType(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "NotATriangle";
        } else if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else if (isRightTriangle(side1, side2, side3)) {
            return "RightTriangle";
        } else {
            return "Scalene";
        }
    }

    public static boolean isRightTriangle(double side1, double side2, double side3) {
        double[] sides = {side1, side2, side3};
        // Sort the sides in ascending order
        java.util.Arrays.sort(sides);
        // Check if it satisfies the Pythagorean theorem
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }
}

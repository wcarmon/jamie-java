import java.util.Scanner;

public class Main {

    // try running with:    1.5 -3.4 4.6 5 9.5 -3.4
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three points for a triangle: (separated by spaces)");
        double p1x = scanner.nextDouble();
        double p1y = scanner.nextDouble();

        double p2x = scanner.nextDouble();
        double p2y = scanner.nextDouble();

        double p3x = scanner.nextDouble();
        double p3y = scanner.nextDouble();

        System.out.println("Point #1: " + p1x + ", " + p1y);
        System.out.println("Point #2: " + p2x + ", " + p2y);
        System.out.println("Point #3: " + p3x + ", " + p3y);

        double area = calculateAreaForTriangle(
                p1x, p1y,
                p2x, p2y,
                p3x, p3y);

        System.out.println("The area of the triangle is " + roundToOneDecimal(area));
    }

    public static double calculateAreaForTriangle(
            double p1x, double p1y,
            double p2x, double p2y,
            double p3x, double p3y) {

        // side1 has p1 & p2
        double side1 = distanceBetween(p1x, p1y, p2x, p2y);

        // side2 has p2 & p3
        double side2 = distanceBetween(p2x, p2y, p3x, p3y);

        // side3 has p3 & p1
        double side3 = distanceBetween(p3x, p3y, p1x, p1y);

        double s = (side1 + side2 + side3) / 2;

        double tmp = s * (s - side1) * (s - side2) * (s - side3);

        double area = Math.sqrt(tmp);

        return area;
    }

    public static double distanceBetween(double firstX, double firstY,
                                         double secondX, double secondY) {
        double xDifference = Math.abs(secondX - firstX);
        double yDifference = Math.abs(secondY - firstY);
        double sum = (xDifference * xDifference) + (yDifference * yDifference);
        return Math.sqrt(sum);
    }

    public static double roundToOneDecimal(double d) {
        return Math.round(d * 10.0) / 10.0;
    }
}

// Koodi otettu materiaaleista
package coordinates;

public class Main {
    public static double sqrt(double a) {
        double x = a / 2; // Initial quess for the square root
        double eps = 4 * Math.ulp(a); // Check the accuracy of number representation

        while (Math.abs(x * x - a) >= eps) { // Iterative algorithm until we have enough accuracy
            x = (a / x + x) / 2; // Improve the estimate x for the square root
        }

        return (x);
    }

    public static void main(String[] args) {
        Point p0 = new Point(0, 0, 0);
        Point p1 = new Point(11, 5, 13);
        Point p2 = new Point(23, 24, 25);

        System.out.println("The distance between points 1 and 2 is " + p1.distance(p2));
        System.out.println("The distance between point 1 and origin is " + p1.distance(p0));
    }
}
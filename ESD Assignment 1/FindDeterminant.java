/* Java program to find the determinant of a quadratic equation */

public class FindDeterminant {

  public static void main(String[] args) {

    // value a, b, and c
    double a = 2.3, b = 4, c = 5.6;
    double root1, root2;

    // calculate the determinant (b^2 - 4ac)
    double determinant = b * b - 4 * a * c;
    System.out.println("The determinant of " + a + "x^2 + " + b + "x + " + c + " is " + determinant);
  }
}
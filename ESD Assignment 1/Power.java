/* Java program to find the power of a number without using existing methods */
// Using recursion to calculate the power

class Power {

    public static void main(String[] args) {
        int base = -2, exponent = 3;
        int result = power(base, exponent);

        System.out.printf("%d^%d = %d", base, exponent, result);
    }

    public static int power(int base, int exponent) {
        if (exponent != 0)
            return (base * power(base, exponent - 1));
        else
            return 1;
    }
}
/* Java program that reads a number in inches, and converts it to meters (CLA) */

class InchesToMeters{

    public static void main(String[] args)
	{

		double inch = Double.parseDouble(args[0]);
		double meters = (double) inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }
}
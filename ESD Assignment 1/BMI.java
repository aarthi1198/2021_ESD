/* Java program to compute body mass index (BMI) */

class BMI{
    public static void main(String args[]) 
	{
       double weight_kg = 55, height_meter = 1.5, BMI;
       BMI = weight_kg / (height_meter * height_meter);
       System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}
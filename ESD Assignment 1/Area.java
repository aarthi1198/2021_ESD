/* Java program to find the area of a)Circle b)Rectangle c)Square d)Trapezoid e)Rhombus f)Square */

class Area
{
    void calculateArea(float x)
    {
        System.out.println("Area of the square: " + x * x + " sq units");
    }
    void calculateArea(float x, float y) //Method overloading
    {
        System.out.println("Area of the rectangle: " + x * y + " sq units");
    }
    void calculateArea(double r)
    {
        double area = 3.14 * r * r;
        System.out.println("Area of the circle: " + area + " sq units");
    }
	void calculateArea(int b1, int b2, int h)
    {
        double area = ((b1 + b2) / 2) * h;
		System.out.println("Area of the trapezoid: "+ area + " sq units");
    }
	void calculateArea(int d1, int d2)
	{
		double  area = (d1 * d2)/ 2;
		System.out.println("Area of the rhombus: "+ area + " sq units");
    }
	void calculateArea(double b, double h)
	{
		double area = (b * h)/ 2;
		System.out.println("Area of the triangle: "+ area + " sq units");
    }
	
    public static void main(String args[]){
         Area obj = new Area();
       
	     obj.calculateArea(6.1f); //calls the first area() method as only one argument is passed. "f" suffix denotes the float numbers
	   
	     obj.calculateArea(10f,22f); //calls the second area() method as two arguments with suffix "f" are passed
	  
	     obj.calculateArea(6.1); //calls the third area() method as not suffixed with "f". In such a case, the type is considered as double
		 
		 obj.calculateArea(8,10,6); //calls the fourth area() method as three arguments are passed
		 
		 obj.calculateArea(15,18); //calls the fifth area() method as two arguments without suffix "f" are passed
		 
		 obj.calculateArea(4.0,13.0); //calls the sixth area() method as two arguments of type double are passed
		 
    }
}
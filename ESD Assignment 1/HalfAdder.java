/* Java program to implement a Half adder using Bitwise operator */ 

// For Half Adder, Sum = x'y + xy'  Carry = xy
 
class HalfAdder
{
    public void HalfAdderTable()
    {
        boolean a, b, s, cr;
        int x, y, sum, carry;
        System.out.println(" x | y | c | s ");  System.out.println("---|---|---|---"); // TRUTH TABLE HEADER
        for(x = 0; x < 2; x++){
            for(y = 0; y < 2; y++){
                a = (x == 0)? false : true;    b = (y == 0)? false : true; // INITIALIZING BOOLEAN VALUES IN BINARY FORM
                s = !a & b || a & !b;        cr = a & b; // FULL ADDER SUM AND CARRY CHECK OPERATION
                sum = (s == false) ? 0:1;       carry = (cr == false) ? 0:1; // CONVERTING BOOLEAN SUM AND CARRY TO INTEGERS
                System.out.println(" "+x+" | "+y+" | "+carry+" | "+sum); // PRINTING EACH LINE OF TRUTH TABLE
            }
        }
    }
	
    public static void main(String args[])
    {
        HalfAdder obj = new HalfAdder();
        System.out.println("\nHalf Adder Truth Table\n");  
		obj.HalfAdderTable();
    }
}
/* Java program to find whether a circle is inside another circle or not */
// 3 possible cases : (1) smaller circle lying completely inside the bigger circle and touching each other at a point of the circumference
// (2) smaller circle lying completely inside the bigger circle without touching each other at a point of circumference
// (3) The smaller circle does not lie completely inside the bigger circle

import java.io.*;
 
class CircleInsideOrNot
{
         
    static void circle(int x1, int y1, int x2,
                int y2, int r1, int r2)
    {
        int distSq = (int) Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
     
        if (distSq + r2 == r1)
        {
            System.out.println("The smaller circle lies completely"
                + " inside the bigger circle and "
                + "touches each other "
                + "at a point of circumference.") ;
        }
                 
        else if (distSq + r2 < r1)
        {
            System.out.println("The smaller circle lies completely"
                + " inside the bigger circle without"
                + " touching each other "
                + "at a point of circumference.") ;
        }
                 
        else
        {
            System.out.println("The smaller does not lie completely inside"
                + " the bigger circle.") ;
        }
                 
    }
     
    // Driver code
    public static void main (String[] args)
    {
        int x1 = 7, y1 = 8;
        int x2 = 3, y2 = 5;
        int r1 = 30, r2 = 25;
        circle(x1, y1, x2, y2, r1, r2);
    }
}
 
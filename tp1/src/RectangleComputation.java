/*
 * Print the area and perimeter of a rectangle, given its lengh and width.
 */
public class RectangleComputation {  // Save as "RectangleComputation.java"
   public static void main(String[] args) {
      // Declare 4 double variables to hold length, width, area and perimeter.
      // A "double" holds floating-point number with an optional fractional part.
      double length, width, area, perimeter;
      

      length = 10;
      width = 20;
      // Compute area and circumference
      area = length * width;
      perimeter =  2* length + 2* width;
      
      // Print results
      System.out.print("The area is ");  // Print description
      System.out.println(area);          // Print the value stored in the variable
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }
}

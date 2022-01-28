/*
 * Print the surface area, base are and volume of a cylinder, given its radius and height.
 */
public class CylinderComputation {  // Save as "CylinderComputation.java"
   public static void main(String[] args) {
      // Declare 5 double variables to hold radius, height, surfaceArea, baseArea and volume.
      // A "double" holds floating-point number with an optional fractional part.
      double radius, height, surfaceArea, baseArea, volume;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e. constant).
      final double PI = 3.14159265;
      
      // Assign a value to radius. (We shall read in the value from the keyboard later.)
      radius = 3;
      height = 10;
      
      surfaceArea = 2 * PI * radius * height + 2 * PI * radius * radius;
      volume = PI * radius * radius * height;
      baseArea = PI * radius * radius;
      
      // Print results
      System.out.print("The surface area is ");  // Print description
      System.out.println(surfaceArea);          // Print the value stored in the variable
      System.out.print("The volume is ");
      System.out.println(volume);
      System.out.print("The baseArea is ");
      System.out.println(baseArea);
   }
}

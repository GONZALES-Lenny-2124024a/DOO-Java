public class PrintLeapYears {  // Save as "PrintLeapYears.java"
   public static void main(String[] args) {
      final int LOWERBOUND = 999;      // Store the lowerbound
      final int UPPERBOUND = 2010;   // Store the upperbound
      int count = 0;   // Declare an int variable "count" to accumulate the number of the leap years
                     // Set the initial count to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int year = LOWERBOUND;
      while (year <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
	 if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
		 ++count;
		 System.out.println(year);
	}
         ++year;            // increment number
      }
      // Print the result
      System.out.println("The number of leap years between  " + LOWERBOUND + " and " + UPPERBOUND + " is " + count);
   }
}

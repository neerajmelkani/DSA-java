import java.util.Arrays;
public class Printing2dArr {
   public static void main(String[] args) {
      
      //Using nested for loops
      int[][] myArray_1= {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
      };
      System.out.println("Printing a 2D array using nested loops:");
      for (int i = 0; i < myArray_1.length; i++) {
         for (int j = 0; j < myArray_1[i].length; j++) {
            System.out.print(myArray_1[i][j] + " ");
         }
         System.out.println();
      }

      // Using Arrays.deepToString() method
      String[][] myArray_2 = {
         {"Welcome", "to", "Tutorials"},
         {"Point", "start", "learning"}
      };
      System.out.println("\nPrinting a 2D array using Arrays.deepToString:");
      System.out.println(Arrays.deepToString(myArray_2));
   }
}
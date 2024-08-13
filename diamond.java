public class diamond {
    public static void main(String[] args) {
        int i, j, row = 6;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
            // inner loop work for space
            for (j = row - i; j > 1; j--) {
                // prints space between two stars
                System.out.print(" ");
            }
            // inner loop for columns
            for (j = 0; j <= i; j++) {
                // prints star
                System.out.print("* ");
            }
            // throws the cursor in a new line after printing each line
            System.out.println();
        }
        for (i = 1; i <= 6; i++) {
            // inner loop work for space
            for (j = 1; j <= i; j++) {
                // prints space between two stars
                System.out.print(" ");
            }
            
            for (j = row; j > 0; j--) {
                // prints star
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }
}

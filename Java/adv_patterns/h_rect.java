package Practice.Java.adv_patterns;

/**
 * This program prints a hollow rectangle of asterisks (*) with given rows and columns.
 * Only the border of the rectangle is filled with asterisks, the inside is hollow (spaces).
 */
public class h_rect {

    /**
     * Prints a hollow rectangle of the specified size.
     * @param row Number of rows in the rectangle
     * @param col Number of columns in the rectangle
     */
    public static void hollow(int row, int col) {
        // Loop through each row
        for (int i = 1; i <= row; i++) {
            // Loop through each column in the current row
            for (int j = 1; j <= col; j++) {
                // Print '*' for the border (first or last row, or first or last column)
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    // Print space for the inside of the rectangle
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int count=1;
        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop through each column in the current row
            for (int j = 1; j <= i; j++) {
                // Print '*' for the border (first or last row, or first or last column)
                System.out.print(count+" ");
                count++;
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Print a hollow rectangle of 5 rows and 4 columns
        hollow(5, 4);
        floyds_triangle(5);
    }
}

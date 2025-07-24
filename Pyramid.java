import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print numbers from 1 to i
            for (int num = 1; num <= i; num++) {
                System.out.print(num + " ");
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}

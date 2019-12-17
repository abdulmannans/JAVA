import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter How Many Steps OF Pyramid: ");
        int rows =scan.nextInt(), k = 0;
        for(int i = 1; i <= rows; ++i, k = 0) {
            System.out.print(" ");
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            for (k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
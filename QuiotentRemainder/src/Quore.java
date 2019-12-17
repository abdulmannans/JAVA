import java.util.*;
class Quore{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Dividend");
        int dividend = s.nextInt();
        System.out.println("Enter Divisor");
        int divisor= s.nextInt();

        int quiotent = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quiotent is "+ quiotent);
        System.out.println("Remainder is "+remainder);
    }
}
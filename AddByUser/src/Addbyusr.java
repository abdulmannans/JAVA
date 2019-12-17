import java.util.*;
class Addbyusr{
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter Value For First Variable: ");
        int no1= a.nextInt();
        System.out.println("Enter Value For Second Variable: ");
        int no2= a.nextInt();
        int c =no1+no2;
        System.out.println("The Sum Of Two Variable is: "+c);
    }
}
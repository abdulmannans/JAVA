import java.util.*;
class Terop{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int a=s.nextInt();
        String output=(a%2==0)?"Number is Even":"Number is odd";
        System.out.println(output);
    }
}

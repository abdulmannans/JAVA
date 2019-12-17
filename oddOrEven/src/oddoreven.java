import java.util.*;
class Oddoreven{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int a=s.nextInt();
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number Is Odd");
        }
    }
}
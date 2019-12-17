import java.util.*;
class Palin{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter A number: ");
        int number =input.nextInt();
        int lstdgt=0 ,temp=number, sum=0;
        while(number>0){
            lstdgt=number%10;
            sum = (sum*10)+lstdgt;
            number=number/10;
        }
        if(temp==sum){
            System.out.println(temp+ " Is A Palindrome Number.");
        }else{
            System.out.println(temp+ " Is Not A Palindrome Number");
        }

    }
}
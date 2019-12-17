import java.util.*;
class Prime{
    public static void main(String[] args) {
        int count=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int usrput= input.nextInt();
        for(int i=usrput-1; i>=2; i--){
            if(usrput%i==0){
                count+=1;
            }
        }
        if(count==0){
            System.out.println(usrput+ " Is A Prime Number");
        }else{
            System.out.println(usrput+ " Not A Prime Number");
        }

    }
}
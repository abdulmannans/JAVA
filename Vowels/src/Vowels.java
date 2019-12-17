import java.util.*;
class Vowels{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Character: ");
        char conv= input.next().charAt(0);
        char lwrcase = Character.toLowerCase(conv);
        if(lwrcase == 'a' || lwrcase == 'e' || lwrcase == 'i' || lwrcase == 'o' || lwrcase == 'u'){
            System.out.println("Entered Character Is Vowel");
        }
        else{
            System.out.println("Entered Character Is Constant");

        }
    }
}w
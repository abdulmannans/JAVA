class Animals{
    Animals(){
        System.out.println("Animal Is Created.");
    }
}
class Dog extends Animals{
    Dog(){
        super();
        System.out.println("Dog Is Created.");
    }
}
public class SuperUse3 {
    public static void main(String[] args) {
        Dog Fluffy = new Dog();
    }
}

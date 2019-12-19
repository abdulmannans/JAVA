//Javatpoint.com Example
class Animal{
    String Color ="White";
}
class Dog extends Animal{
    String Color = "Black";
    void Printcolor(){
        System.out.println(Color);
        System.out.println(super.Color);
    }
}
public class SuperUse1 {
    public static void main(String[] args) {
        Dog Fluffy = new Dog();
        Fluffy.Printcolor();
    }
}

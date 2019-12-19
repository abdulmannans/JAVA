import java.time.DayOfWeek;

class Animals{
    void eat(){
        System.out.println("Eating....");
    }

}
class Dog extends Animals{
    void eat(){
        System.out.println("Eating Food....");
    }
    void Bark(){
        System.out.println("Barking....");
    }
    void invokeParent(){
        super.eat();
        Bark();
    }

}
public class SuperUse2 {
    public static void main(String[] args) {
        Dog Fluffy = new Dog();
        Fluffy.invokeParent();

    }
}

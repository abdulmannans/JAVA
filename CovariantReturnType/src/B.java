class A{
    A get(){
        System.out.println("This Is Class A.");
        return this;
    }
}
public class B extends A {
    B get(){
        System.out.println("This Is Class B.");
        return this;
    }
    void message(){
        System.out.println("This Is Covariant Type.");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.get().message();
    }
}

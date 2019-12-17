class Add{
    Add(int a ,int b){
        System.out.println("The Sum Is: "+(a+b));
    }
    Add(float a, float b){
        System.out.println("The Sum Is "+(a+b));
    }
}

public class Overload {
    public static void main(String[] args) {
        float a=10.5f, pi=3.14f;
        int b=10, c=99;
        Add fltA = new Add(a,pi);
        Add integer = new Add(b,c);

    }


}

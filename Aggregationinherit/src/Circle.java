class Operation{
    double Square(double x) {
        return x * x;
    }
}
class CirArea{
    Operation op;
    double pi =3.14;
    double Area(double radius){
        op = new Operation();
        double rsqr = op.Square(radius);
        return pi*rsqr;
    }
}


public class Circle {
    public static void main(String[] args) {
        double radius =11.1;
        CirArea c = new CirArea();
        double Result = c.Area(radius);
        System.out.println(Result);
    }
}

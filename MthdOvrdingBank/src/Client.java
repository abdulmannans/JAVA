// Example From Javatpoint.com
class Bank{
    int getRateOfInterest() {return 0;}
}
class SBI extends Bank{
    int getRateOfInterest() {return 8;}
}
class ICIC extends Bank{
    int getRateOfInterest() {return 7;}
}
class RBI{
    int getRateOfInterest() {return 10;}
}

public class Client {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICIC i = new ICIC();
        RBI r = new RBI();
        System.out.println("The Interest Rate Of SBI Is: "+s.getRateOfInterest());
        System.out.println("The Interest Rate Of ICIC Is: "+i.getRateOfInterest());
        System.out.println("THE Interest Rate Of RBI Is: "+r.getRateOfInterest());
    }
}

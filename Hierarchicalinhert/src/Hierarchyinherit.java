class Junkfood{
    String J = "Harmful";
}
class Pizza extends Junkfood {
    Pizza() {
        System.out.println("Pizza Is " + J);
    }
}
class Frankie extends Junkfood{
        Frankie(){
            System.out.println("Frankie Is "+J);
        }
}

public class Hierarchyinherit {
    public static void main(String[] args) {
        Pizza P =new Pizza();
        Frankie F = new Frankie();
    }

}

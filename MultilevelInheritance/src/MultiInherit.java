    class Cheese{
    String C ="Cheese";
    }
    class Vegetables extends Cheese{
    String V = "Vegetables";
    }
    class Pizza extends Vegetables{
    Pizza(){
        System.out.println("Pizza Is Made using "+V+" And "+C+".");
    }
    }

public class MultiInherit {
    public static void main(String[] args) {
        Pizza P =new Pizza();

    }
}

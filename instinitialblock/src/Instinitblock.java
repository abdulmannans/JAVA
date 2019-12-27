public class Instinitblock {
    int speed;
    Instinitblock(){
        System.out.println("Thr Speed Is :"+speed);
    }
    {
        speed =100;
    }
    {
        speed =200;
    }


    public static void main(String[] args) {
        Instinitblock s = new Instinitblock();
    }
}

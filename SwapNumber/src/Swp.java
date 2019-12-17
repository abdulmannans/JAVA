class Swp{
    public static void swapr(int a, int b){
        System.out.println("Before: ");
        System.out.println("The Value Of A is:"+a+" The value Of B is:"+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After: ");
        System.out.println("The Value Of A is:"+a+" The value Of B is:"+b);
    }
    public static void main(String[] args) {
        swapr(12,13);
    }
}
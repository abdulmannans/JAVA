class Fiborecur{
    static int fst=0 ,scnd=1, series;
    static void fst2(){
        System.out.print(" "+fst);
        System.out.print(" "+ scnd);
    }
    static void Fibo(int count){
        if(count>0){
            series=fst+scnd;
            System.out.print(" "+series);
            fst=scnd;
            scnd=series;
            Fibo(count-1);
        }
    }
    public static void main(String[] args) {
        fst2();
        Fibo(10);
    }

}
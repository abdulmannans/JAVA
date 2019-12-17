class Fibofunc{
    static void Fibo(int times){
        int series, fst=0, scnd=1;
        System.out.println(fst);
        System.out.println(scnd);
        for (int i=0;i<=times;i++){
            series=fst+scnd;
            System.out.println(series);
            fst=scnd;
            scnd = series;
        }
    }
    public static void main(String[] args) {
        Fibo(10);

    }

}
// Example From Javatpoint.com
class Vehicle {
    void run(){
        System.out.println("Vehicle Is Running");
    }
}
class Bike extends Vehicle {
    void run(){
        System.out.println("Bike IS Running Safely");
    }
    public static void main(String[] args) {
        Bike B = new Bike();
        B.run();

    }
}

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Emp extends Person{
        float salary;
        Emp(int id , String name, float salary){
            super(id,name);
            this.salary=salary;
        }
        void display(){
            System.out.println(id+" "+name+" "+salary);
        }
}

public class SuperReal {
    public static void main(String[] args){
        Emp First = new Emp(1,"Mannan",45000);
        First.display();

    }
}

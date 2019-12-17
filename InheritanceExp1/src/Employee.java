    class ItDept{
        int salary = 400000;
    }
    class programmer extends ItDept{
        String Name="Abdul";
    }
public class Employee {

    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println("The Name Of Employee Is "+p.Name);
        System.out.println("The Salary Of "+p.Name+ " Is "+p.salary);
    }
}

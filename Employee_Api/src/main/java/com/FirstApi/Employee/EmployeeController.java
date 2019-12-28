package com.FirstApi.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.FirstApi.Employee.Employee;

@RestController
public class EmployeeController {
    @RequestMapping("/")
    public List<Employee> getEmployees(){
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1, "Abdul Mannan","Siddiquei","samannan1999@gmail.com"));
        employeesList.add(new Employee(2, "Ibrahim","Jogilkar","jogilkaribrahim@gmail.com"));
        return employeesList;
    }
}

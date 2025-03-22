package LLD.SOLID.SingleResponsibilty;

/* dedicated class to manage persistence of Employee details */
public class EmployeeRepository {
    
    public void saveEmployee(Employee employee) {
        /* some employee */
    }
}

/* Any change in the way or place , we save the details of the employee
 * wont effect the implementation of employee or any other class
 */

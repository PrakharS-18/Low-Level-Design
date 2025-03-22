package LLD.SOLID.SingleResponsibilty;

/* Dedicated class to calculate salary */
public class SalaryCalculator {
    
    public double calculateSalary(Employee employee) {
        return employee.getEmployeeSalary();
    }
}

/* Any change in future, the way we calculate salary
 * wont effect the employee class and its implementation
 */

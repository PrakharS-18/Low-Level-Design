package LLD.SOLID.OpenClosed;

import LLD.SOLID.SingleResponsibilty.Employee;

/* A class/module/interface should be open for extension but closed for modification.
   You should be able to add new functionality without changing the existing code.
*/
public class OpenClosedInvalid {
    public void calculateSalary(Employee employee) {
        if (employee.getEmployeeName().equals("androidDeveloper")) {
            /* some implementation */
        }
        else if(employee.getEmployeeName().equals("webDev")) {
            /* some implementation */
        }
    }
}

/* suppose we want to add a new type of employee
 * Lets say "pythonDev"
 * 
 * 
 * CONS
 * We need to modify the class method
 *  - which is not good because
 *      - chances to break down the code
 *      - maintainability issue
 *      - redability
 */

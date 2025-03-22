package LLD.SOLID.SingleResponsibilty;


/*
 * SINGLE RESPONSIBILTY PRINCIPLE
 * -- A class should have only 1 reason to change 
 * -- A class should only have 1 responsiblity
 */
public class EmployeeInvalid {
    
    private String employeeName;
    private String employeeAddress;
    private double employeeSalary;

    public void saveEmployee() {
        /* some implementation */
    }

    public double calculateSalary() {
        /* some implementation */
        return employeeSalary;
    }

    public String updateAddress() {
        /* some implementation */
        return employeeAddress;
    }

    /* 
     * Above example violates Single Responsibilty Principle
     * - here the class has multiple responsiblity
     *      - it has to save the employee to somewhere
     *      - it has to calculate the Salary of the employee
     *      - it has to update the address of the employee
     * 
     * - Reason to change
     *      - change in area where to save the employee 
     *      - change in process to calculate the salary of the employee
     *      - address updation might you some different algo 
     * 
     * - you can see there are multiple reason to change
     *      - the problem is any one change effect the whole class , which is not good , as it difficult to maintain
     *      - multiple responsiblity means tighter coupling , making changes riskier
     */

     /* 
      * Why is SRP Important?

        Easier Maintenance – If a class has only one responsibility, changes are easier to manage.

        Better Readability – A focused class is easier to understand.

        Reduces Coupling – When classes have multiple responsibilities, they become tightly coupled, making changes riskier.

        Enhances Reusability – A single-purpose class can be reused in different parts of the system.
     */

     /* what is the solution for this problem 
      * Seperate class , seperate responsiblity
     */


}

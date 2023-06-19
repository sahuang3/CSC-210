/*
 *  Assignment 7
 *  Description: This program uses the Employee class to create private data fields, public setters/getters, a static
 *  variable, and a method to print the Employee's information at the end.
 */

// Creating Employee Class
public class Employee {
    // Initializing and setting data fields as private
    private int Id; // Side Note: I'm assuming ID is in numbers and not letters, otherwise it would be in String
    private String Name;
    private String EmailId;
    private String Dept;
    // Static Variable - to keep count of employee objects
    private static int employeeCount = 0;

    // Constructors
    // With parameters
    public Employee(int employeeID, String employeeName, String employeeEmail, String employeeDept) {
        Id = employeeID;
        Name = employeeName;
        EmailId = employeeEmail;
        Dept = employeeDept;
        employeeCount += 1; // +1 Employee
    }

    // With no parameters
    public Employee() {
        Id = 0;
        Name = "";
        EmailId = "";
        Dept = "";
    }

    // Setters and Getters
    // Setters
    public void setId(int userId) {
        Id = userId;
    }
    public void setName(String userName) {
        Name = userName;
    }
    public void setEmailId(String userEmail) {
        EmailId = userEmail;
    }
    public void setDept(String userDept) {
        Dept = userDept;
    }
    // Getters
    public int getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public String getEmailId() {
        return EmailId;
    }
    public String getDept() {
        return Dept;
    }

    // Method - to print details of the employee
    public void printEmployee(){
        System.out.println("Employee Information: " +Id +", " +Name +", " +EmailId +", " + Dept);
    }
}



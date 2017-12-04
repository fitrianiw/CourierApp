package fitri.com;

public class Employee {
    String employeeName;
    private String studentName;
    double salary;
    int age;

    public Employee() {
       
    }
    
    public Employee(String employeeName){
        this.employeeName = employeeName;
    }
    
    public Employee(String employeeName, double salary){
        this.employeeName = employeeName;
        this.salary = salary;
    }
    
    public Employee(String employeeName, double salary, int age){
        this.employeeName = employeeName;
        this.salary = salary;
        this.age =age;
    }
    
    public String toString(){
        return employeeName = studentName;
    }
}

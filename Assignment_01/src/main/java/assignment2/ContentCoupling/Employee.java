package assignment2.ContentCoupling;

public class Employee {
    public String name;
    public int ID;
    public double salary;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Hridita";
        employee.ID = 1497;
        employee.salary = 5000000;

        System.out.println(employee.name + "\n" + employee.ID + "\n" + employee.salary);
    }
}

//Content coupling occurs between two modules if one refers to the internals of the other
//module. For example, if one module branches into another module, if one module refers to
//or changes data in another module, or if one module alters a statement in another module. In
//practice, only assembler language allows content coupling. Most procedural and objectoriented
//programming languages make it difficult to implement content coupling.
//Here, attributes of Employee class can be directly accessed and modified.
//This type of coupling is known as Content Coupling

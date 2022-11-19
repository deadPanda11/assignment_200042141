package assignment2.DataCoupling;

public class Student {
    private String name;
    private int ID;
    private int age;

    public void setName(String newName){
        this.name = newName;
    }

    public void setID(int newID){
        this.ID = newID;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Samia");
        student.setID(41);
        student.setAge(20);

        System.out.println(student.getName());
        System.out.println(student.getID());
        System.out.println(student.getAge());
    }
}

//Data coupling occurs between two modules when data are passed by parameters using a
//simple argument list and every item in the list is used
//Here, the attributes of Student class are private attributes
//and thus they cannot be accessed directly
//getter and setter methods are introduced to be able to access them from outside the Student class
//This type of coupling is known as Data Coupling


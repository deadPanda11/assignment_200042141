package assignment2.Independence;

public class Person {
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

//Independent coupling suggests that different classes don't depend on each other
//Here the Mobile class and Person class don't share any data and aren't dependent on one another in any way
//This coupling phenomenon is known as Independence

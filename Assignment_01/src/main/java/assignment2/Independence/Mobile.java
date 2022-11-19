package assignment2.Independence;

public class Mobile {
    String model;
    double price;

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setPrice(12000);
        mobile.setModel("Pixel 6A");
    }
}

//Independent coupling suggests that different classes don't depend on each other
//Here the Mobile class and Person class don't share any data and aren't dependent on one another in any way
//This coupling phenomenon is known as Independence

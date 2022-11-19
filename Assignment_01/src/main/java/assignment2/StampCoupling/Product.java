package assignment2.StampCoupling;

public class Product {
    String productName;
    int productID;

    public void setProduct(Mobile mobile) {
        mobile.model = "Pixel 6A";
        mobile.price = 12000;
    }
}

//Stamp coupling occurs between modules when data are passed by parameters using a data
//structure containing fields which may or may not be used
//Here, Product class is using Mobile class as a stamp
//passing a Mobile class object in the setProduct method as parameter
//This type  of coupling is known as Stamp Coupling
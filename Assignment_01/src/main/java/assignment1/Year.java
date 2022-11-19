package assignment1;

public class Year {
    int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean leapYear() {
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }
}

package assignment1;

public class Day {
    int day;

    Day(int day) {
        this.day = day;
    }

    public boolean thirtyFirstDay() {
        if(day == 31)
            return true;
        else
            return false;
    }

    public boolean thirtiethDay() {
        if(day == 30)
            return true;
        else
            return false;
    }

    public boolean twentyNinthDay() {
        if(day == 29)
            return true;
        else
            return false;
    }

    public boolean twentyEighthDay() {
        if(day == 28)
            return true;
        else
            return false;
    }
}

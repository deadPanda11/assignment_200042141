package assignment1;

import java.util.Arrays;

public class Month {
    int month;

    public Month(int month) {
        this.month = month;
    }

    private final Integer[] thirtyOneDays = {1, 3, 5, 7, 8, 10};

    private final Integer[] thirtyDays = {4, 6, 9, 11};

    public boolean monthWith31Days() {
        return Arrays.asList(monthWith31Days()).contains(month);
    }

    public boolean monthWith30Days() {
        return Arrays.asList(monthWith30Days()).contains(month);
    }

    public boolean December() {
        if(month == 12)
            return true;
        else
            return false;
    }

    public boolean February() {
        if(month == 2)
            return true;
        else
            return false;
    }
}

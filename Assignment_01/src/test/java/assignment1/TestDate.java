package assignment1;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class TestDate {
    @Test
    public void test1()
    {
        int day = 31; int month = 1; int year = 2020;

        String expected = "1/2/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d.thirtyFirstDay() && m.monthWith31Days() )  { day = 1; month++; }

        else if( d.thirtiethDay() && m.monthWith30Days() )  { day = 1; month++; }

        else if(d.thirtyFirstDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.leapYear())
            {
                if(d.twentyNinthDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.leapYear() )
            {  if(d.twentyEighthDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test2()
    {
        int day = 30; int month = 4; int year = 2020;

        String expected = "1/5/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d.thirtyFirstDay() && m.monthWith31Days() )  { day = 1; month++; }

        else if( d.thirtiethDay() && m.monthWith30Days() )  { day = 1; month++; }

        else if(d.thirtyFirstDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.leapYear())
            {
                if(d.twentyNinthDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.leapYear() )
            {  if(d.twentyEighthDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test3()
    {
        int day = 28; int month = 2; int year = 2020;

        String expected = "29/2/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d.thirtyFirstDay() && m.monthWith30Days() )  { day = 1; month++; }

        else if( d.thirtiethDay() && m.monthWith30Days() )  { day = 1; month++; }

        else if(d.thirtyFirstDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.leapYear())
            {
                if(d.twentyNinthDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.leapYear() )
            {  if(d.twentyEighthDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }

    @Test
    public void test4()
    {
        int day = 15; int month = 7; int year = 2020;

        String expected = "16/7/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d.thirtyFirstDay() && m.monthWith31Days() )  { day = 1; month++; }

        else if( d.thirtiethDay() && m.monthWith30Days() )  { day = 1; month++; }

        else if(d.thirtyFirstDay() && m.December())  { day = 1; month++; year++; }

        else if(m.February())
        {
            if(y.leapYear())
            {
                if(d.twentyNinthDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.leapYear() )
            {  if(d.twentyEighthDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }


    @Test
    public void test5()
    {
        int day = 31; int month = 12; int year = 2020;

        String expected = "1/1/2021";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if( d.thirtyFirstDay() && m.monthWith31Days() )  { day = 1; month++; }

        else if( d.thirtiethDay() && m.monthWith30Days())  { day = 1; month++; }

        else if(d.thirtyFirstDay() && m.December())  { day = 1; month = 1; year++; }

        else if(m.February())
        {
            if(y.leapYear())
            {
                if(d.twentyNinthDay())  { day = 1; month++; }
                else  { day++; }
            }

            else if( !y.leapYear() )
            {  if(d.twentyEighthDay())  { day=1; month++; }  }
        }

        else { day++; }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }
}

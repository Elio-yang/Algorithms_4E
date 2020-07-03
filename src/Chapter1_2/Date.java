package Chapter1_2;

import java.util.Objects;

/**
 * Created by Elio Yang on 2020/7/2.
 */
public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int m,int d,int y){
        month=m;
        day=d;
        year=y;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date)) return false;//instanceof  whether belong to some class
        Date date = (Date) o;
        return getMonth() == date.getMonth() &&
                getDay() == date.getDay() &&
                getYear() == date.getYear();
    }


}

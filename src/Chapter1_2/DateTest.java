package Chapter1_2;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import jdk.nashorn.internal.parser.Scanner;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * Created by Elio Yang on 2020/7/2.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(4, 23, 2020);
        Date date2 = new Date(2, 12, 2020);
        LocalDate date3 = LocalDate.of(2020, 4, 23);
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        System.out.println(date3.toString());

        System.out.println(date1.equals(date2));
    }
}

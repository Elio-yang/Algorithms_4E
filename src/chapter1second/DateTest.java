package chapter1second;



/**
 *
 * @author Elio Yang
 * @date 2020/7/2
 */
public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(4, 23, 2020);
        Date date2 = new Date(2, 12, 2020);
        System.out.println(date1.toString());
        System.out.println(date2.toString());

        System.out.println(date1.equals(date2));
    }
}

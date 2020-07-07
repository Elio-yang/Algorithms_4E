package chapter1part2;

import edu.princeton.cs.algs4.*;

/**
 *
 * @author Elio Yang
 * @date 2020/7/2
 */
public class Interval2dTest {
    public static void main(String[] args) {
        double xlo=Double.parseDouble(args[0]);
        double xhi=Double.parseDouble(args[1]);
        double ylo=Double.parseDouble(args[2]);
        double yhi=Double.parseDouble(args[3]);
        int T= Integer.parseInt(args[4]);

        Interval1D xInterval=new Interval1D(xlo,xhi);
        Interval1D yInterval=new Interval1D(ylo,yhi);
        Interval2D box=new Interval2D(xInterval,yInterval);
        box.draw();

        Counter c=new Counter("hits");
        for (int i=0;i<T;i++){
            double x=Math.random();
            double y= Math.random();
            Point2D p=new Point2D(x,y);
            if (box.contains(p)){
                c.increment();
            }
            else {
                p.draw();
            }
        }

        StdOut.println(c);
        StdOut.println(box.area());
    }
}

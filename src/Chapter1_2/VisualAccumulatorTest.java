package Chapter1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Elio Yang on 2020/7/2.
 */

public class VisualAccumulatorTest {

    private double total;
    private int N;

    /***
     *
     * @param trials times of experiments
     * @param max max Y scale
     */
    public VisualAccumulatorTest(int trials, double max){
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.005);
    }

    /***
     * Draw data and average
     * @param val data to be added
     */
    public void addDataValue(double val){
        N++;
        total+=val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
    }
    public double mean(){
        return total/N;
    }
    public String toString(){
        return "mean"+mean();
    }
    public static void main(String[] args) {
        int T=Integer.parseInt(args[0]);
        VisualAccumulatorTest a=new VisualAccumulatorTest(T,1.0);
        for (int i=0;i<T;i++){
            a.addDataValue(StdRandom.uniform());
        }
        StdOut.println(a);
    }
}

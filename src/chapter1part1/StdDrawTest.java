package chapter1part1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by Elio Yang on 2020/6/30.
 */
public class StdDrawTest {
    public static void show(int N,double[] arr){
        for (int i=0;i<N;i++){
            double x=1.0*i/N;
            double y=arr[i]/2.0;
            double rw=0.5/N;
            double rh=arr[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
            StdDraw.show();

        }
    }
    public static void main(String[] args) {
        int N=50;
        double[] a=new double[N];
        for(int i=0;i<N;i++){
            a[i]= StdRandom.uniform(0f,1f);
        }
        show(N,a);
        Arrays.sort(a);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        show(N,a);
    }
}


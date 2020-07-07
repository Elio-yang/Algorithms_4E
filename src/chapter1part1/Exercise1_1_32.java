package chapter1part1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;


/**
 * Created by Elio Yang on 2020/7/1.
 */
public class Exercise1_1_32 {
    public static void histogram(double l, double r,int N, double[] arr){
        StdDraw.setCanvasSize(700,700);
        StdDraw.setXscale(l,r);
        StdDraw.setYscale(0,1000);
        int[] frequency =new int[N];
        double sequence=(r-l)/N;
        for (double v : arr) {
            int index = (int) ((v - l) / (r - l) * N);
            frequency[index]++;
        }
        for (int i=0;i<N;i++){
            double x=l+sequence*i+sequence/2.0;
            double y=frequency[i]/2.0;
            double rw=sequence/4.0;
            double rh=frequency[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
    public static void main(String[] args){
        double l=1.01;
        double r=1000.2;
        int N=8;
        double[] arr=new double[1000];
        for (int i=0;i<1000;i++){
            arr[i] =StdRandom.uniform(l+1,r-1);
        }
        histogram(l,r,N,arr);
    }



}

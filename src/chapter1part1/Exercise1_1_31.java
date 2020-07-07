package chapter1part1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

public class Exercise1_1_31 {
    /***
     *
     * @param N number of dots
     * @param p possibility of connecting
     */
    public static void randomConnect(int N, double p) {
        StdDraw.setCanvasSize(640, 640);
        StdDraw.setScale(-1.2, 1.2);

        StdDraw.circle(0, 0, 1);
        StdDraw.setPenRadius(0.05);
        double[][] position = new double[N][2];
        for (int i = 0; i < N; i++) {
            double xi = Math.cos(2.0 * i * Math.PI / N);
            double yi = Math.sin(2.0 * i * Math.PI / N);
            StdDraw.point(xi, yi);
            position[i][0] = xi;
            position[i][1] = yi;
        }
        StdDraw.setPenColor(Color.GRAY);
        StdDraw.setPenRadius();
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                if (StdRandom.bernoulli(p)){
                    StdDraw.line(position[i][0],position[i][1],position[j][0],position[j][1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int N=15;
        double p=0.5;
        randomConnect(N,p);
    }
}

package chapter1part1;

import java.util.Scanner;

/**
 *
 * @author Elio Yang
 * @date 2020/6/29
 */
public class NewtonIterTest {
    public static double sqrt(double a) {
        if (a < 0) {
            return Double.NaN;
        }
        double eps = 1e-15;
        double x = a;
        while (Math.abs(x - a / x) > eps) {
            x = (x + a / x) / 2.0;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double solution = sqrt(a);
        System.out.println(solution);
    }
}

/*
 * 牛顿迭代法：
 * Xn+1=Xn-f(Xn)/f'(Xn)
 * 精度eps
 * while(abs(Xn+1-Xn)>eps)
 */



package chapter1first;

import java.util.Scanner;

/**
 * Created by Elio Yang on 2020/6/29.
 */
public class fastInverseSqrtTest {
    public static float fastFloatInverseSqrt(float x) {
        float xHalf = 0.5f * x;
        int reEncode = Float.floatToIntBits(x);
        reEncode = 0x5f3759df - (reEncode >> 1);
        x = Float.intBitsToFloat(reEncode);
        x *= (1.5f - xHalf * x * x);
        return x;
    }

    public static double fastDoubleInverseSqrt(double x) {
        double xHalf = 0.5d * x;
        long reEncode = Double.doubleToLongBits(x);
        reEncode = 0x5fe6ec85e7de30daL - (reEncode >> 1);
        x = Double.longBitsToDouble(reEncode);
        x *= (1.5d - xHalf * x * x);
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float test1 = fastFloatInverseSqrt(in.nextFloat());
        System.out.println("the answer is " + test1);
        double test2 = fastDoubleInverseSqrt(in.nextDouble());
        System.out.println("the answer is " + test2);
    }
}
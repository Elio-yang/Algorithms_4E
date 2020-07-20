package chapter1part1;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Elio Yang on 2020/6/30.
 */
public class Exercise1_1_20 {
    static Map<Integer,Long> map=new HashMap<>();
    public static long Frac(int N){
        if(N==0){
            return 1;
        }
        else{
            if(map.containsKey(N)){
                return map.get(N);
            }
            else {
                long m=N*Frac(N-1);
                map.put(N,m);
                return m;
            }
        }
    }
    public static double ln(int N){
        return Math.log((double)Frac(N));
    }
    public static void main(String[] args) {
        int N=3;
        StdOut.println(ln(N));

    }
}

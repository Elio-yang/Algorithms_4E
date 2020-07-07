package chapter1first;

import edu.princeton.cs.algs4.StdOut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Elio Yang on 2020/6/30.
 */
public class Exercise1_1_19 {
    /***
     * Array Saved to store the calculated results
     */
    private static long[] Saved=new long[100];
    /***
     * Faster method to calculate fibo(N)
     * @param N the index of the number
     * @return the fibo-number
     */
    public static long fiboArraySaved(int N) {
        if (N <= 1) {
            return N;
        }
        if (Saved[N] == 0) {
            Saved[N] = fiboArraySaved(N - 1) + fiboArraySaved(N - 2);
        }
        return Saved[N];

    }

    static Map<Integer,Long> hashmap =new HashMap<>();
    /***
     * Using HashMap to store the calculated results
     * @param N the N-th number
     * @return the fibo-number
     */
    public static long fiboHashMapSaved(int N){
        if (N<=1){
            return N;
        }
        if (hashmap.containsKey(N)){
            return hashmap.get(N);
        }
        else {
            long m= fiboHashMapSaved(N-1)+ fiboHashMapSaved(N-2);
            hashmap.put(N,m);
            return m;
        }
    }

    /***
     * Test
     * @param args command-line argument
     */
    public static void main(String[] args) {
        int N=50;
        StdOut.println(fiboArraySaved(N));
        StdOut.println(fiboHashMapSaved(N));
    }
}

package Chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by Elio Yang on 2020/6/28.
 */
public class binarySearchTest {
    /***
     *
     * @param key the search key
     * @param a the array which must be sorted
     * @return {@code -1} if not exist {@code a}if exist
     */
    public static int rank(int key,int[] a){
        int lo=0;
        int hi=a.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid]) hi=mid-1;
            else if(key>a[mid]) lo=mid+1;
            else return mid;
        }
        return -1;
    }
//    public static int rankRecursion(int key, int[] a, int lo, int hi){
//        if (lo>hi) return -1;
//        int mid=lo+(hi-lo)/2;
//        if(key<a[mid]) return rankRecursion(key,a,lo,mid-1);
//        else if(key>a[mid]) return rankRecursion(key,a,mid+1,hi);
//        else return mid;
//    }

    /***
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] testList= new In(args[0]).readAllInts();
        Arrays.sort(testList);
        while (!StdIn.isEmpty()){
            int key=StdIn.readInt();
            if (rank(key,testList)==-1)
                StdOut.println(key);
        }
    }
}

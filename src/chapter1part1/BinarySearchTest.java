package chapter1part1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

/**
 *
 * @author Elio Yang
 * @date 2020/6/28
 */
public class BinarySearchTest {
    /***
     *
     * @param key the search key
     * @param a the array which must be sorted
     * @return {@code -1} if not exist {@code a}if exist.
     */
    public static int rank(int key,int[] a){
        int l;
        int hi;
        hi=a.length-1;
        l=0;
        while (l<=hi){
            int mid=l+(hi-l)/2;
            if(key<a[mid]) {
                hi=mid-1;
            }
            else if(key>a[mid]) {
                l=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    /***
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        int[] testList= new In(args[0]).readAllInts();
        Arrays.sort(testList);
        while (!StdIn.isEmpty()){
            int key=StdIn.readInt();
            if (rank(key,testList)==-1){
                StdOut.println(key);
            }
        }
    }
}

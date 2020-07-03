package Chapter1_1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Elio Yang on 2020/6/30.
 */
public class Exercise1_1_13 {
    /***
     * Transposition of a matrix
     * @param arr
     * @return
     */
    public static int[][] TransMatrix(int[][] arr){
        int M=arr.length;
        int N=arr[0].length;
        int[][] trans =new int[N][M];
        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                trans[i][j]=arr[j][i];
            }
        }
        return trans;
    }
    /***
     * Generate random matrix for testing
     * @param M
     * @param N
     * @return
     */
    public static int[][] RandomArr(int M,int N){
        int[][] arr=new int[M][N];
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                arr[i][j]= StdRandom.uniform(0,10);
            }
        }
        return arr;
    }
    /***
     * Print the matrix
     * @param arr
     */
    public static void PrintMatrix(int[][] arr){
        int M=arr.length;
        int N=arr[0].length;
        for (int[] ints : arr) {
            for (int j = 0; j < N; j++) {
                StdOut.printf("%3d", ints[j]);
            }
            StdOut.println();
        }
    }
    /***
     *
     * @param args
     */
    public static void main(String[] args){
        int[][] arr=RandomArr(10,20);
        StdOut.println("Before:");
        PrintMatrix(arr);
        StdOut.println("After:");
        arr=TransMatrix(arr);
        PrintMatrix(arr);
    }
}

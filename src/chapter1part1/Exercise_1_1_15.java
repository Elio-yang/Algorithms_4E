package chapter1part1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by Elio Yang on 2020/6/30.
 */
public class Exercise_1_1_15 {
    /**
     * ans[i]=times of number i occurs in arr
     * @param arr
     * @param M
     * @return
     */
    public static int[] histogram(int[] arr,int M){
        int[] ans=new int[M];
        Arrays.fill(ans,0);
        for(int i=0;i<M;i++){
            int cnt=0;
            for (int j=0;j<M;j++){
                if (arr[j]==i){
                    ++cnt;
                }
            }
            ans[i]=cnt;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={0,1,1,2,4,6,8,10,0,1,2};
        int[] ans=histogram(arr,arr.length);
        for(int i=0;i<arr.length;i++) {
            StdOut.println(ans[i]);
        }
    }
}

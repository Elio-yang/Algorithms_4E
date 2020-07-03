package Chapter1_2;

import java.util.Arrays;

/**
 * Created by Elio Yang on 2020/7/2.
 */
public class StaticSETofInts {
    private int[] a;
    public StaticSETofInts(int[] arr){
        a= new int[arr.length];
        for (int i=0;i<a.length;i++){
            a[i]=arr[i];
        }
        Arrays.sort(a);
    }
    boolean isContain(int key){
        return rank(key)!=-1;
    }
    public int rank(int key){
        int lo=0;
        int hi=a.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if (key<a[mid]) hi=mid-1;
            else if(key>a[mid]) lo=mid+1;
            else return mid;
        }
        return -1;
    }
}

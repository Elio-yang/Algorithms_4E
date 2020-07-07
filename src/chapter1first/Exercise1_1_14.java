package chapter1first;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author Elio Yang
 * @date 2020/6/30
 */
public class Exercise1_1_14 {
    /***
     * return a max value s.t. a<log_2(N)
     * @param N
     * @return
     */
    public static int lg(int N){
        int cnt=0;
        int ans=1;
        for(;;){
            if(ans>N){
                break;
            }
            ++cnt;
            ans*=2;
        }
        return --cnt;
    }
    public static void main(String[] args){
        int n=18;
        StdOut.println(lg(n));
    }
}

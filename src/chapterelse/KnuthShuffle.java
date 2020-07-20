package chapterelse;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Elio
 * @date 2020/7/20
 */
public class KnuthShuffle {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        knuth(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void swapArr(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    /**
     * Knuth sorting algorithm : get an random list of n cards
     * <p>
     * There are 5 cards :
     * <p>
     * 1  2  3  4  5
     * <p>
     * suppose the first card to be selected is 5 : possibility : 1/5
     * <p>
     * the from 1 ~ 4 if we chose 1 randomly then
     * <p>
     * 5  2  3  4   1
     * <p>
     * the the card 4 :possibility : 4/5 * 1/4 = 1/5
     * @param arr list of cards.
     */
    public static void knuth(int[] arr) {
        Random random=new Random();
        for(int i=arr.length-1;i>=0;i--){
            swapArr(arr,i,random.nextInt(arr.length));
        }
    }

}

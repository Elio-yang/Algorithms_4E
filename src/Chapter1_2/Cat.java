package Chapter1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * Created by Elio Yang on 2020/7/2.
 */
public class Cat {
    public static void main(String[] args) {
        Out out=new Out(args[args.length-1]);
        for (int i=0;i<args.length-1;i++){
            In in=new In(args[i]);
            String s=in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}

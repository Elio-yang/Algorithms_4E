package chapter1part3;

import edu.princeton.cs.algs4.StdIn;
import java.util.Stack;

/**
 * @author ELIO
 * @date 2020/07/07
 */
public class DijkstraDoubleStack {
    /**
     * the first stack to store operations: + - * / ( )
     * <p>
     * the second stack to store values: double type
     * <p>
     * omit ( and push other operations when there is a )
     * <p>
     * stack_ops pop one element and doing arithmetic with two value in stack_val,
     * push the answer into the stack_val,in the end pop the last element in stack_val
     * will get the answer.
     * @param args the command line argument
     */
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> val = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
                 if ("(".equals(s))    {  }
            else if ("+".equals(s))    { ops.push(s); }
                 else if ("-".equals(s))    { ops.push(s); }
                 else if ("*".equals(s))    { ops.push(s); }
                 else if ("/".equals(s))    { ops.push(s); }
                 else if ("sqrt".equals(s)) { ops.push(s); }
                 else if (")".equals(s)) {
                String op = ops.pop();
                double v1 = val.pop();
                double ans = 0;
                     if ("+".equals(op))    { ans = val.pop() + v1;val.push(ans); }
                     else if ("-".equals(op))    { ans = val.pop() - v1;val.push(ans); }
                     else if ("*".equals(op))    { ans = val.pop() * v1;val.push(ans); }
                     else if ("/".equals(op))    { ans = val.pop() / v1;val.push(ans); }
                     else if ("sqrt".equals(op)) { ans = Math.sqrt(v1) ;val.push(ans); }
                     else                   { val.push(ans); }
            }
                 else { val.push(Double.parseDouble(s)); }
        }
        System.out.println(val.pop());
    }
}

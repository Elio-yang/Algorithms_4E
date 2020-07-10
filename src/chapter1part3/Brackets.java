package chapter1part3;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 *有效字符串需满足：
 * <p>
 *左括号必须用相同类型的右括号闭合。
 * <p>
 *左括号必须以正确的顺序闭合。
 * <p>
 *注意空字符串可被认为是有效字符串。
 *
 * @author Elio Yang
 * @date 2020/7/10
 */
public class Brackets {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('){ans.push(')');}
            else if(c=='['){ans.push(']');}
            else if(c=='{'){ans.push('}');}
            else if(ans.isEmpty()||ans.pop()!=c){return false;}
        }
        return ans.isEmpty();
    }
}

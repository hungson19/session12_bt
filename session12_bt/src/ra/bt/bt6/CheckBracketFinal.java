package ra.bt.bt6;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBracketFinal {
    static boolean checkChar (String sym){
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < sym.length(); i++) {
            char n = sym.charAt(i);
            if (n =='('||n=='{'||n=='['){
                stack.push(n);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (n){
                case ')':
                    check = stack.pop();
                    if (check == '}'||check == ']'){
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == ')'|| check == ']'){
                        return false;
                    }
                    break;
                case']':
                    check = stack.pop();
                    if (check == '}'|| check == ')'){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String x = "s*(s–a)*(s–b)*(s–c)";
        String y = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        if (checkChar(x)){
            System.out.println("Well");
        }else {
            System.out.println("???");
        }
    }
}


package multibracketvalidation;

import stacksandqueues.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String data){


        if (data == "")
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < data.length(); i++){

            char current = data.charAt(i);
            if(current == '{' || current == '(' || current == '['){
                stack.push(current);
            }

            if(current == '}' || current == ')' || current == ']'){
                if (stack.data())
                    return false;

                char last = Stack.peek.data();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return true;
    }
}
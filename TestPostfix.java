
public class TestPostfix {
    public static int precedence(char c)
    {
        switch (c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
    public static String conversionFromInfixToPostfix(String e)
    {
        char[] charElement = new String(e).toCharArray();
        ArrayOfStack<Character> stack = new ArrayOfStack<>(e.length());
        String output = "";
        for (int i = 0; i < e.length(); i++) {
            if (charElement[i] == ' ') continue;
            if (Character.isDigit(charElement[i]))
            {
                output +=  charElement[i];
            }
            else if (charElement[i] == '(')
            {
                stack.push('(');
            }
            else if (charElement[i] == ')')
            {
                while (! stack.top().equals('('))
                {
                    output += stack.top();
                    stack.pop();
                }
                stack.pop();
            }
            else
            {
                while (! stack.isEmpty() && precedence(charElement[i]) <= precedence(stack.top()))
                {
                    output += stack.top();
                    stack.pop();
                }
                stack.push(charElement[i]);
            }
        }
        while (! stack.isEmpty())
        {
            output += stack.top();
            stack.pop();
        }

        return output;
    }

    public static void main(String[] args) {
        String exp = "(5+6)*(5+9)/3";
        System.out.println("The infix is :"+ exp);
        String exp2 = conversionFromInfixToPostfix(exp);
        System.out.println("The postfix is :" + exp2);
        System.out.println("The result is :"+ postfixExcepation(exp2));
    }
    public static int postfixExcepation(String e)
    {
        char[] chars = new String(e).toCharArray();
        ArrayOfStack<Integer> stack = new ArrayOfStack<>(e.length());
        int result ;
        for (int i = 0; i < e.length(); i++) {
            if (Character.isDigit(chars[i]))
            {
                stack.push(Integer.parseInt(String.valueOf(chars[i])));
            }
            else {
                int n2 = stack.top();
                stack.pop();
                int n1 = stack.top();
                stack.pop();
                stack.push(operation(n1,chars[i],n2));
            }
        }
        result = stack.top();
        stack.pop();
         return result;
    }
    public static int operation(int n1, char c, int n2)
    {
        switch (c)
        {
            case '+':
                return ( n1 + n2);
            case '-':
                return (n1 - n2 );
            case '*':
                return (n1 *n2 );
            case '/':
                if (n2 ==0)
                    return 0;
                return (n1/n2);
            case '^':
                return (n1^n2);
        }
        return 0;
    }
}

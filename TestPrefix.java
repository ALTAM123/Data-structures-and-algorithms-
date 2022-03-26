public class TestPrefix {

    public static String covertInfixToPrefix(String exp)
    {
        ArrayOfStack<Character> s = new ArrayOfStack<>(exp.length());
        char[] p = exp.toCharArray();
        final  int sz = p.length;
        char[] e = new char[sz];
        String output = "";
        for (int i = 0; i < sz; i++) {
            if (p[(sz-1)-i] == '(')
                p[(sz-1)-i] = ')';
            else if (p[(sz-1)-i] == ')')
                p[(sz-1)-i] = '(';
            e[i] = p[(sz-1)-i];
        }
        for (int i = 0; i < sz; i++) {
            if (e[i] == ' ') continue;
            if (Character.isDigit(e[i]))
            {
                output += e[i];
            }
            else if (e[i] == '(')
            {
                s.push('(');
            }
            else if (e[i] == ')')
            {
                while ( s.top() != '(')
                {
                        output += s.top();
                        s.pop();
                }
                s.pop();
            }
            else {
                while (! s.isEmpty() && p(e[i]) < p(s.top()) )
                {
                 output += s.pop();
                }
                s.push(e[i]);
            }
        }
        while (! s.isEmpty())
        {
            output += s.pop();
        }
/*       p = output.toCharArray();
        for (int i = 0; i < p.length; i++) {
            e[i] = p[(p.length-1) - i];
        }
        output = e.toString();*/
        return output;
    }
    public static int p(char operand)
    {
        if (operand == '+' || operand == '-')
        return 1;
        else if (operand == '*' || operand == '/')
        return 2;
        else if (operand == '%' || operand == '^')
            return 3;
        return 0;
    }

    public static void main(String[] args) {
        String exp = "(5+3)*(3+(9-4))";
        System.out.println( covertInfixToPrefix(exp));
    }

}

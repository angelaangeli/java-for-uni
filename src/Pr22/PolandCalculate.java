package Pr22;

import java.util.LinkedList;
public class PolandCalculate {
    static String primer;
    static boolean ifOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
    }
    static boolean Delenie(char c) {
        return c == ' ';
    }
    static int prioritetOper(char oper) {
        switch (oper) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return -1;
        }
    }
    static void processOperator(LinkedList<Integer> st, char oper) {
        int right = st.removeLast();
        int left = st.removeLast();
        switch (oper) {
            case '+':
                st.add(left + right);
                break;
            case '-':
                st.add(left - right);
                break;
            case '*':
                st.add(left * right);
                break;
            case '/':
                st.add(left / right);
                break;
            case '%':
                st.add(left % right);
                break;
        }
    }
    public static Integer calculate(String s) {
        LinkedList<Integer> stoka = new LinkedList<Integer>();
        LinkedList<Character> oper = new LinkedList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Delenie(c))
                continue;
            if (c == '(')
                oper.add('(');
            else if (c == ')') {
                while (oper.getLast() != '(')
                    processOperator(stoka, oper.removeLast());
                oper.removeLast();
            } else if (ifOperator(c)) {
                while (!oper.isEmpty() && prioritetOper(oper.getLast()) >= prioritetOper(c))
                    processOperator(stoka, oper.removeLast());
                oper.add(c);
            } else {
                String operand = "";
                while (i < s.length() && Character.isDigit(s.charAt(i)))
                    operand += s.charAt(i++);
                --i;
                stoka.add(Integer.parseInt(operand));
            }
        }
        while (!oper.isEmpty())
            processOperator(stoka, oper.removeLast());
        return stoka.get(0);
    }
    public static void main(String[] args) {
        String classic_string = "2-8+(32+1)/9*12+8";
        String polish_String="2 8 - 32 1 + 9 / 12 * + 8 +";
        PolandCalculate test=new PolandCalculate();
        test.primer=classic_string;
        PolandCalculate test1=new PolandCalculate();
        test1.primer=polish_String;
        System.out.printf("Результат классики = %d", test.calculate(test.primer));
        System.out.printf("\nРезультат польский = %d", test.calculate(test1.primer));
    }
}

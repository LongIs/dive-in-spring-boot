package com.loong.diveinspringboot.test9.interpreter.demo1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 比如“ 8 3 2 4 - + * ”这样一个表达式，我们按照上面的语法规则来处理，取出数字“8 3”和“-”运算符，计算得到 5，于是表达式就变成了“ 5 2 4 + * ”。
 * 然后，我们再取出“ 5 2 ”和“ + ”运算符，计算得到 7，表达式就变成了“ 7 4 * ”。最后，我们取出“ 7 4”和“ * ”运算符，最终得到的结果就是 28。
 *
 * 看懂了上面的语法规则，我们将它用代码实现出来，如下所示。代码非常简单，用户按照上面的规则书写表达式，传递给 interpret() 函数，就可以得到最终的计算结果。
 */
public class ExpressionInterpreter {

    private Deque<Long> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length+1)/2; ++i) {
            numbers.addLast(Long.parseLong(elements[i]));
        }

        for (int i = (length+1)/2; i < length; ++i) {
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            long number1 = numbers.pollFirst();
            long number2 = numbers.pollFirst();
            long result = 0;

            if (operator.equals("+")) {
                result = number1 + number2;
            } else if (operator.equals("-")) {
                result = number1 - number2;
            } else if (operator.equals("*")) {
                result = number1 * number2;
            } else if (operator.equals("/")) {
                result = number1 / number2;
            }
            numbers.addFirst(result);
        }

        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }
        return numbers.pop();
    }

    public static void main(String[] args) {
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        System.out.println(interpreter.interpret("1 8 3 2 4 - + * +"));
    }
}

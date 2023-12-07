import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0){
            return 0;
        }
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        long acc = 0;

        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                    String operand2 = stack.pop();
                    String operand1 = stack.pop();
                    String operator = token;
                    stack.push(String.valueOf(eval(operand1, operand2, operator)));
            }else{
                stack.push(token);
            }
        }


        return Integer.parseInt(stack.pop());
    }
    private long eval(String operand1, String operand2, String operator){
        long operand2L = Long.parseLong(operand2);
        long operand1L = Long.parseLong(operand1);
        return switch (operator){
            case "+" -> operand1L + operand2L;
            case "-" -> operand1L - operand2L;
            case "*" -> operand1L * operand2L;
            case "/" -> operand1L / operand2L;
            default -> 0;
        };
    }
}

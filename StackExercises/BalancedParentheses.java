package StackExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//{[()]}
//{[(])}
//{{[[(())]]}}
        String lookupTable="(){}[]";

        String[] input = scanner.nextLine().split("");
//        for (String s : input) {
//            if(!lookupTable.contains(s+""));{
//                System.out.println("NO");
//                return;
//            }
//
//        }




        ArrayDeque<String> queue = new ArrayDeque<>(Arrays.asList(input));
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String s : input) {
            stack.push(s);

        }
        boolean hasMatch = true;
        while (!stack.isEmpty()) {
            String queueChar = queue.remove();
            String stackChar = stack.pop();
            if (!(queueChar.equals("(") && stackChar.equals(")")
                    || queueChar.equals("{") && stackChar.equals("}")
                    || queueChar.equals("[") && stackChar.equals("]")
                    || stackChar.equals("[") && queueChar.equals("]")
                    || stackChar.equals("{") && queueChar.equals("}")
                    || stackChar.equals("(") && queueChar.equals(")"))) {
                hasMatch = false;
                break;
            }

        }
        if(input.length==0){
            System.out.println("NO");
        } else{
            String result = hasMatch ? "YES" : "NO";
            System.out.println(result);
        }



    }
}

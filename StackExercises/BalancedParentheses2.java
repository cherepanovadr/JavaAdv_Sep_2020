package StackExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        String input = scanner.nextLine();
        boolean areBalanced = true;
        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);
            if (currentBracket == '{' || currentBracket == '[' || currentBracket == '(') {
                openBrackets.push(currentBracket);
            } else if (currentBracket == '}' || currentBracket == ']' || currentBracket == ')') {
                if (openBrackets.isEmpty()){
                    areBalanced =false;
                    break;
                }
                char open = openBrackets.pop();
                if ((currentBracket == '}') && (open != '{')) {
                    areBalanced = false;
                } else if ((currentBracket == ']') && (open != '[')) {
                    areBalanced = false;

                } else if ((currentBracket == ')') && (open != '(')) {
                    areBalanced = false;

                }
                }


            }
        if(areBalanced){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }}

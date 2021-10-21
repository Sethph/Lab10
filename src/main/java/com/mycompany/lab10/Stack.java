/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab10;

/**
 *
 * @author sethp
 */
public class Stack {

    private final int stack[] = new int[10];
    private int index;
    private final String expression;

    public Stack(String exp) {
        this.expression = exp;
        index = -1;
    }

    public void push(int val) {
        stack[++index] = val;
    }

    public int pop() {
        int val = stack[index];
        index--;
        return val;
    }

    public int evaluate() {
        String[] s = expression.split("\\s+");
        for (String attribute : s) {
            switch (attribute) {
                case "+": {
                    int a = pop();
                    int b = pop();
                    push(b + a);
                    break;
                }
                case "-": {
                    int a = pop();
                    int b = pop();
                    push(b - a);
                    break;
                }
                case "*": {
                    int a = pop();
                    int b = pop();
                    push(b * a);
                    break;
                }
                case "/": {
                    int a = pop();
                    int b = pop();
                    push(b / a);
                    break;
                }
                default:
                    int a = Integer.parseInt(attribute);
                    push(a);
                    break;
                    

            }
        }
        int result = pop();
        return result;
    }

}

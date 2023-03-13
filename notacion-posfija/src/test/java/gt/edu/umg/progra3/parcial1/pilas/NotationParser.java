package gt.edu.umg.progra3.parcial1.pilas;

import java.util.Stack;

public class NotationParser {

    public Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    public String posFixToInfix(String expression){
        String[] tokens = expression.split(" ");
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (token.matches("\\d+")) { // Si el token es un número, lo agregamos a la pila
                stack.push(token);
            } else { // Si el token es un operador, aplicamos el operador a los dos últimos elementos de la pila
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String infixExpr =operand1 + " " + token + " " + operand2;
                stack.push(infixExpr);
            }
        }

        return stack.pop();
    }

}

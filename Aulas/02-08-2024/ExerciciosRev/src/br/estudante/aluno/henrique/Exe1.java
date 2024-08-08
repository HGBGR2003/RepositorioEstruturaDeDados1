package br.estudante.aluno.henrique;

import java.util.Scanner;
import java.util.Stack;

public class Exe1 {
	
	
	public static boolean resposta(String entrada) {
		 Stack<Character> pilha = new Stack<>();

	     for (char ch : entrada.toCharArray()) {
	    	 if (ch == '(' || ch == '{' || ch == '[') {
	    		 pilha.push(ch);
	         }
	        
	        else if (ch == ')' || ch == '}' || ch == ']') {
	        	if (pilha.isEmpty()) {
	        		return false;
	            }
	                
	            char topo = pilha.pop();
	            if ((ch == ')' && topo != '(') ||
	               (ch == '}' && topo != '{') ||
	               (ch == ']' && topo != '[')) {
	            	return false;
	            }
	         }
	       }
	        
	       return pilha.isEmpty();	
	}

	public static void main(String[] args) {
		Scanner impressora = new Scanner(System.in);
		String entrada;
		boolean resultado;
		
		System.out.println("Entre com um valor com parenteses, colchetes ou chaves:");
		entrada = impressora.next();
		
		resultado = resposta(entrada);
		
		System.out.println("A String tá balanceada ? " + resultado);
		
		impressora.close();
			
	}
	
	

}

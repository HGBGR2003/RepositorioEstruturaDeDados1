package br.estudante.aluno.henrique;

public class Exe2 {	
	public static void main(String[] args) {
		int [] entrada = {1,2,3,4,5};
		int k = 3;
		
		for (int i = 0; i < k; i++) {
			entrada = rotacionar(entrada);
		}
		
		for(int i: entrada) {			
			System.out.println(i);
		}
		
	}

	public static int[] rotacionar(int[] array) {
		int aux = array[array.length - 1];
		
		for(int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		
		array[0] = aux;
		
		return array;
		
	}
	
}

package br.edu.ifgoiano.estudante.henrique;

public class Tempo {

	public static void main(String[] args) {
		long tempoInicio = System.currentTimeMillis();
		for(long i = 0; i < 9999999; i++) {
			fatorial(50);
		}
		long tempoTotal = System.currentTimeMillis() - tempoInicio;
		
		System.out.println(String.format("Tempo total de %s ms", tempoTotal));

		tempoInicio = System.currentTimeMillis();
		for(long i = 0; i < 9999999; i ++) {
			fatorialRecursivo(50);
		}
		
		tempoTotal = System.currentTimeMillis() - tempoInicio;
		
		System.out.println(String.format("Tempo total de %s ms", tempoTotal));
		
	}
	
	//Forma padrão.
	public static int fatorial(int n) {
		int acum = n;
		
		for(int i = n - 1; i >= 1; i--) {
			acum = acum * i;
		}
		
		return acum;
		
	}
	
	//Agora de Forma Recursiva
	public static int fatorialRecursivo(int n) {
		if (n <= 1) {
			return 1;
		}else {
			return n * fatorialRecursivo(n - 1);
		}
	}

}

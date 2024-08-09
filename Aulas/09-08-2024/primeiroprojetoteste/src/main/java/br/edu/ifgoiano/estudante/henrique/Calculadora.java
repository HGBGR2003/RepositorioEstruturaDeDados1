package br.edu.ifgoiano.estudante.henrique;

public class Calculadora {
    public static Double somar(Double a, Double b){
        validarEntrada(a, b);
        return a + b;
    }

    public static Integer somar(Integer a, Integer b){
        validarEntrada(a, b);
        return a + b;
    }

    public static void validarEntrada(Object a, Object b){
        if (a == null || b == null) {
            throw new RuntimeException("Não é possivel somar valores Null");
        }
    }

}

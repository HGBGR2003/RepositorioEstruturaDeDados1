package br.edu.ifgoiano.aluno.henrique.principal;

import br.edu.ifgoiano.aluno.henrique.VerificacaoValores;

public class BinarioMain {
    public static void main(String[] args) {
        VerificacaoValores vv = new VerificacaoValores();
        int[] verificacaoArray = {1, 3, 20, 4, 1, 0};
        int valoresMetadeArray = verificacaoArray.length / 2;
        int pico = vv.picoDOVetor(verificacaoArray.length-1, 0, valoresMetadeArray, verificacaoArray);
        if (pico == -1) {
            System.out.println("");
            System.out.println("Nenhum pico foi encontrado no array passado para verificação.");
        }
        System.out.println("");
        System.out.println("O pico encontrado no array passado é: " + pico);
    }
}

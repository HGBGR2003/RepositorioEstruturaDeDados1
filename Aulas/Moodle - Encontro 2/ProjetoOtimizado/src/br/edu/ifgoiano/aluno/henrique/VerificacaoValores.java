package br.edu.ifgoiano.aluno.henrique;

public class VerificacaoValores {

    private  static int direita(int d ,int resultante){
        int novaDireita =  d;
        return novaDireita = resultante - 1;
    }

    private static  int esquerda(int  e ,int resultante ){
        int  novaEsquerda = e;
        return novaEsquerda = resultante + 1;
    }

    public static int  picoDOVetor(int d, int e, int resultante, int[] verificandoValoresDePico) {
        while (d >= e) {
            resultante = e + (d - e) / 2;
            if (resultante - 1 >= 0 && resultante + 1 < verificandoValoresDePico.length - 1) {
                if (verificandoValoresDePico[resultante] > verificandoValoresDePico[resultante - 1]) {
                    if (verificandoValoresDePico[resultante] > verificandoValoresDePico[resultante + 1]) {
                        return verificandoValoresDePico[resultante];
                    }
                }
                if (verificandoValoresDePico[resultante] < verificandoValoresDePico[resultante - 1]) {
                    d = direita(d, resultante);
                }
                if (verificandoValoresDePico[resultante + 1] > verificandoValoresDePico[resultante])
                    if ((resultante + 1) <= (verificandoValoresDePico.length - 1)) {
                        e = esquerda(e, resultante);
                    }
            }
            if (e == resultante || resultante == d) return verificandoValoresDePico[resultante];
        }
        return -1;
    }
}

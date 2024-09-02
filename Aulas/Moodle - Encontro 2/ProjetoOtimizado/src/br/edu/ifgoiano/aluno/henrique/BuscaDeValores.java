package br.edu.ifgoiano.aluno.henrique;

public class BuscaDeValores {
    public static void main(String[] args) {
        int [][] matrizFuncionando = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int valor  = 17;

        buscaDeValores(matrizFuncionando, valor);

    }

    public static boolean buscaDeValores(int [] [] valor, int requisito){
        int linhas = valor.length;
        int colunas = valor[0].length;
        int i = 0;
        int j = colunas - 1;

        while (i < linhas && j >= 0){
            if (valor[i][j] == requisito){
                System.out.println("true");
                return true;
            }else if (valor[i][j] > requisito){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("false");
        return false;
    }

}

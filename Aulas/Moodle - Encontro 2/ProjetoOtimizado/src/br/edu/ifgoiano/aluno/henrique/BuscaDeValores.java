package br.edu.ifgoiano.aluno.henrique;

public class BuscaDeValores {
    public static void main(String[] args) {

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

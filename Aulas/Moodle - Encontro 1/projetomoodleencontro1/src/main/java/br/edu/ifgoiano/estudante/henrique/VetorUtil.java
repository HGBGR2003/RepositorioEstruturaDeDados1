package br.edu.ifgoiano.estudante.henrique;

public class VetorUtil implements IVetorUtil {

    @Override
    public void copiarValores(int[] a, int[] b) {
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
    }

    @Override
    public void copiarValoresInverso(int[] a, int[] b) {
        for(int i = 0 ; i < a.length; i++){
            b[a.length - i - 1] = a[i];
        }
    }

    @Override
    public int[] intercalarElementos(int[] a, int[] b) {
       
        int [] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            result[k++] = a[i++];
            result[k++] = b[j++];
        }

        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }
     
      return result;

    }

    @Override
    public int[] somarVetores(int[] a, int[] b) {
        int [] soma = new int [b.length];

        for(int i = 0; i < a.length; i++){
            soma[i] = a[i] + b[i];
         }

        return soma;

    }
    
}

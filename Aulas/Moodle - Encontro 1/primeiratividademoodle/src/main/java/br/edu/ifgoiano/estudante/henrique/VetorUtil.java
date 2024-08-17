package br.edu.ifgoiano.estudante.henrique;

public class  VetorUtil implements IVetorUtil {
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
       for(int i = 0; i < a.length; i++){
        for(int k = 0; k < b.length; k++){
            b[i,k] = a[k,i];
        }
       }
        
    }

    @Override
    public int[] somarVetores(int[] a, int[] b) {
        // TODO Auto-generated method stub
        return null;
    }


    
}

package br.edu.ifgoiano.estudante.henrique;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class VetorUtilTest {
    @Test
    void copiarValoresInteirosDeUmVetorAoOutro(){
        int [] vetor1 = {1,2,3};
        int [] vetor2 = {0,0,0};
        VetorUtil vet = new VetorUtil();
        vet.copiarValores(vetor1, vetor2);
        assertArrayEquals(new int []{1,2,3}, vetor2);
    }
    
    
    @Test
    void copiarValoresInversosDeDoisVetores(){

    }
    
    @Test 
    void intercalarElementosDeDoisVetores(){

    }
    
    
    @Test
    void somarDoisNumerosDentroDoVetor(){

    }
  
}

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
        int [] vetor1 = {1,2,3};
        int [] vetor2 = {0,0,0};

        VetorUtil vet = new VetorUtil();


        vet.copiarValoresInverso(vetor1, vetor2);

       assertArrayEquals(new int [] {3,2,1}, vetor2);


    }
    
    @Test 
    void intercalarElementosDeDoisVetores(){
        int [] vetor1 = {1,2};
        int [] vetor2 = {2,3,4,5};

        VetorUtil vet = new VetorUtil();

        

    }
    
    
    @Test
    void somarDoisNumerosDentroDoVetor(){
        int [] vetor1 = {1,2,3};
        int [] vetor2 = {4,5,6};
        VetorUtil vet = new VetorUtil();

        int [] resultadoDaSoma = vet.somarVetores(vetor1, vetor2);

        assertArrayEquals(new int [] {5,7,9}, resultadoDaSoma);

    }
  
}

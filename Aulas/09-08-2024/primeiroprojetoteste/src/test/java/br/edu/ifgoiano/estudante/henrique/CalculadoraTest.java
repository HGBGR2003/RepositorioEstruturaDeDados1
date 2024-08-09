package br.edu.ifgoiano.estudante.henrique;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    public void somarDoisValoresInteirosComSucesso(){
        Integer a = 1;
        Integer b = 3;
        
        Object resultado = Calculadora.somar(a, b);

        assertEquals(4, resultado);
        
    }
}

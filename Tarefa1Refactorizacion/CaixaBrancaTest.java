package Tarefa1Refactorizacion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaixaBrancaTest {

    @Test (expected = Exception.class)
    public void c1() throws Exception{
        CaixaBranca CB = new CaixaBranca();
        double resultado = CB.calcularAreaTriangulo(0, 90);
    }

    @Test (expected = Exception.class)
    public void c2() throws Exception{
        CaixaBranca CB = new CaixaBranca();
        double resultado = CB.calcularAreaTriangulo(90, 0);
    }

    @Test 
    public void c3() throws Exception{
        CaixaBranca CB = new CaixaBranca();
        double resultado = CB.calcularAreaTriangulo(10, 10);
        assertEquals(resultado, 50.0, 0);
    }
   
}

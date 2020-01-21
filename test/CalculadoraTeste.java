/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exception.DivisaoPorZeroException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DeliverIT
 */
public class CalculadoraTeste {

    /**
     ************** Soma *******************
     */
    @Test
    public void testSomaDoisNumerosPositivos() {

        //input
        Double numeroUm = 3.0;
        Double numeroDois = 4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doSoma(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("7"), resultado.doubleValue(), 0.001);
    }

    @Test
    public void testSomaDoisNumerosNegativos() {

        //input
        Double numeroUm = -3.0;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doSoma(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("-7"), resultado.doubleValue(), 0.001);
    }

    @Test
    public void testSomaPositivoComNegativo() {

        //input
        Double numeroUm = 3.0;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doSoma(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("-1"), resultado.doubleValue(), 0.001);
    }

    @Test(expected = NullPointerException.class)
    public void testSomaPositivoComNull() {

        //input
        Double numeroUm = null;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doSoma(numeroUm, numeroDois);
    }

    /**
     * *************** Subtração *******************
     */
    @Test
    public void testSubtracaoDoisNumerosPositivos() {

        //input
        Double numeroUm = 4.0;
        Double numeroDois = 3.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doSubtracao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("1"), resultado.doubleValue(), 0.001);

    }

    @Test
    public void testSubtracaoDoisNumerosNegativos() {

        //input
        Double numeroUm = -4.0;
        Double numeroDois = -3.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doSubtracao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("-1"), resultado.doubleValue(), 0.001);
    }

    @Test
    public void testSubtracaoPositivoComNegativo() {

        //input
        Double numeroUm = 3.0;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doSubtracao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("7"), resultado.doubleValue(), 0.001);
    }

    @Test(expected = NullPointerException.class)
    public void testSubtracaoPositivoComNull() {

        //input
        Double numeroUm = null;
        Double numeroDois = 4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        calculadora.doSubtracao(numeroUm, numeroDois);
    }

    /**
     ************** Multiplicação *******************
     */
    @Test
    public void testMultiplicacaoDoisNumerosPositivos() {

        //input
        Double numeroUm = 3.0;
        Double numeroDois = 4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doMultiplicacao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("12"), resultado.doubleValue(), 0.001);
    }

    @Test
    public void testMultiplicacaoDoisNumerosNegativos() {

        //input
        Double numeroUm = -3.0;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doMultiplicacao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("12"), resultado.doubleValue(), 0.001);
    }

    @Test
    public void testMultiplicacaoPositivoComNegativo() {

        //input
        Double numeroUm = 3.0;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doMultiplicacao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("-12"), resultado.doubleValue(), 0.001);
    }

    @Test(expected = NullPointerException.class)
    public void testMultiplicacaoPositivoComNull() {

        //input
        Double numeroUm = null;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doMultiplicacao(numeroUm, numeroDois);
    }

    /**
     ************** Divisão *******************
     */
    @Test
    public void testDivisaoDoisNumerosPositivos() {

        //input
        Double numeroUm = 12.0;
        Double numeroDois = 4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doDivisao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("3"), resultado.doubleValue(), 0.001);
    }

    @Test
    public void testDivisaoDoisNumerosNegativos() {

        //input
        Double numeroUm = -12.0;
        Double numeroDois = -3.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doDivisao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("4"), resultado.doubleValue(), 0.001);
    }

    @Test
    public void testDivisaoPositivoComNegativo() {

        //input
        Double numeroUm = 12.0;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doDivisao(numeroUm, numeroDois);

        // teste
        Assert.assertEquals(Double.parseDouble("-3"), resultado.doubleValue(), 0.001);
    }

    @Test(expected = DivisaoPorZeroException.class)
    public void testDivisaoPositivoComNull() {

        //input
        Double numeroUm = null;
        Double numeroDois = -4.0;

        //Execução
        Calculadora calculadora = new Calculadora();
        Double resultado = calculadora.doDivisao(numeroUm, numeroDois);
    }
}

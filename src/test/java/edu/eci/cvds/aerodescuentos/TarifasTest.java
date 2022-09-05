package edu.eci.cvds.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest {
    
    @Test
    public void dadoUnaPersona_cuandoEsMenorA18_EntoncesSeDescuenta5Porciento(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(230000, 16, 14);
        Assert.assertTrue(218500==tarifa);
    }
    @Test
    public void dadoUnaPersona_cuandoEsMenorA18YPagaConMasDe20DiasAnt_entonces20porcientoDescuento(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(230000, 30, 12);
        Assert.assertTrue(184000==tarifa);
    }
    @Test
    public void dadoUnaPersona_cuandoEsMayorEdad_entoncesNoGeneraDescuento(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(230000, 5, 34);
        Assert.assertTrue(230000==tarifa);
    }
    @Test
    public void dadoUnaPersona_cuandoEsMayorEdadYPagaConMas20DiasAnt_entoncesGenera15porcientoDescuento(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(230000, 60, 45);
        Assert.assertTrue(195500==tarifa);
    }
    @Test
    public void dadoUnaPersona_cuandoEsMayorA65_entoncesGenera8porcientoDescuento(){
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(230000, 6, 67);
        Assert.assertTrue(211600==tarifa);
    }
    @Test
    public void dadoUnaPersona_CuandoEsMayor65YPagaConMasDe20DiasAnt_entoncesGenera23porcientoDescuento() {
        double tarifa;
        tarifa = CalculadorDescuentos.calculoTarifa(230000, 31, 70);
        Assert.assertTrue(177100 == tarifa);
    }
}
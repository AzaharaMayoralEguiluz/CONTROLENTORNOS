/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoralazaharaejercicio11arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam
 */
public class EmpresaTest {
    
    public EmpresaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCrearTrabajadores() {
        System.out.println("crearTrabajadores");
        Empresa instance = new Empresa();
        instance.crearTrabajadores();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMeterDatosTrabajadores() {
        System.out.println("meterDatosTrabajadores");
        Empresa instance = new Empresa();
        instance.meterDatosTrabajadores();
        fail("The test case is a prototype.");
    }

    @Test
    public void testVisualizarCategoria() {
        System.out.println("visualizarCategoria");
        Empresa instance = new Empresa();
        instance.visualizarCategoria();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPorcentageAPercibir() {
        System.out.println("porcentageAPercibir");
        float importeVentas = 0.0F;
        Empresa instance = new Empresa();
        float expResult = 0.0F;
        float result = instance.porcentageAPercibir(importeVentas);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMostrarInforme() {
        System.out.println("mostrarInforme");
        Empresa instance = new Empresa();
        instance.mostrarInforme();
        fail("The test case is a prototype.");
    }

    @Test
    public void testPedirNombre() {
        System.out.println("pedirNombre");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.pedirNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVentasRealizadas() {
        System.out.println("ventasRealizadas");
        Empresa instance = new Empresa();
        float expResult = 0.0F;
        float result = instance.ventasRealizadas();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPedirCategoria() {
        System.out.println("pedirCategoria");
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.pedirCategoria();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

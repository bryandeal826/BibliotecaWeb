/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bryan
 */
public class ReporteTest {
    
    public ReporteTest() {
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

    /**
     * Test of getCod_Reporte method, of class Reporte.
     */
    @Test
    public void testGetCod_Reporte() {
        System.out.println("getCod_Reporte");
        Reporte instance = new Reporte();
        String expResult = "";
        String result = instance.getCod_Reporte();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_Reporte method, of class Reporte.
     */
    @Test
    public void testSetCod_Reporte() {
        System.out.println("setCod_Reporte");
        String Cod_Reporte = "";
        Reporte instance = new Reporte();
        instance.setCod_Reporte(Cod_Reporte);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodLector method, of class Reporte.
     */
    @Test
    public void testGetCodLector() {
        System.out.println("getCodLector");
        Reporte instance = new Reporte();
        String expResult = "";
        String result = instance.getCodLector();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodLector method, of class Reporte.
     */
    @Test
    public void testSetCodLector() {
        System.out.println("setCodLector");
        String CodLector = "";
        Reporte instance = new Reporte();
        instance.setCodLector(CodLector);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodBiblio method, of class Reporte.
     */
    @Test
    public void testGetCodBiblio() {
        System.out.println("getCodBiblio");
        Reporte instance = new Reporte();
        String expResult = "";
        String result = instance.getCodBiblio();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodBiblio method, of class Reporte.
     */
    @Test
    public void testSetCodBiblio() {
        System.out.println("setCodBiblio");
        String CodBiblio = "";
        Reporte instance = new Reporte();
        instance.setCodBiblio(CodBiblio);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDes_Reporte method, of class Reporte.
     */
    @Test
    public void testGetDes_Reporte() {
        System.out.println("getDes_Reporte");
        Reporte instance = new Reporte();
        String expResult = "";
        String result = instance.getDes_Reporte();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDes_Reporte method, of class Reporte.
     */
    @Test
    public void testSetDes_Reporte() {
        System.out.println("setDes_Reporte");
        String Des_Reporte = "";
        Reporte instance = new Reporte();
        instance.setDes_Reporte(Des_Reporte);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSta_Reporte method, of class Reporte.
     */
    @Test
    public void testGetSta_Reporte() {
        System.out.println("getSta_Reporte");
        Reporte instance = new Reporte();
        String expResult = "";
        String result = instance.getSta_Reporte();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSta_Reporte method, of class Reporte.
     */
    @Test
    public void testSetSta_Reporte() {
        System.out.println("setSta_Reporte");
        String Sta_Reporte = "";
        Reporte instance = new Reporte();
        instance.setSta_Reporte(Sta_Reporte);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaReporte method, of class Reporte.
     */
    @Test
    public void testListaReporte() {
        System.out.println("listaReporte");
        Reporte instance = new Reporte();
        LinkedList<Reporte> expResult = null;
        LinkedList<Reporte> result = instance.listaReporte();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarReporte method, of class Reporte.
     */
    @Test
    public void testAgregarReporte() {
        System.out.println("agregarReporte");
        String Cod_Reporte = "";
        String CodLector = "";
        String CodBiblio = "";
        String Des_Reporte = "";
        String Sta_Reporte = "";
        Reporte instance = new Reporte();
        instance.agregarReporte(Cod_Reporte, CodLector, CodBiblio, Des_Reporte, Sta_Reporte);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of editarReporte method, of class Reporte.
     */
    @Test
    public void testEditarReporte() {
        System.out.println("editarReporte");
        String Cod_Reporte = "";
        String CodBiblio = "";
        String CodLector = "";
        String Des_Reporte = "";
        String Sta_Reporte = "";
        Reporte instance = new Reporte();
        instance.editarReporte(Cod_Reporte, CodBiblio, CodLector, Des_Reporte, Sta_Reporte);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarReporte method, of class Reporte.
     */
    @Test
    public void testEliminarReporte() {
        System.out.println("eliminarReporte");
        String Cod_Reporte = "";
        Reporte instance = new Reporte();
        instance.eliminarReporte(Cod_Reporte);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

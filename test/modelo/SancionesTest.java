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
public class SancionesTest {
    
    public SancionesTest() {
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
     * Test of getCod_Sancion method, of class Sanciones.
     */
    @Test
    public void testGetCod_Sancion() {
        System.out.println("getCod_Sancion");
        Sanciones instance = new Sanciones();
        String expResult = "";
        String result = instance.getCod_Sancion();
//       assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_Sancion method, of class Sanciones.
     */
    @Test
    public void testSetCod_Sancion() {
        System.out.println("setCod_Sancion");
        String Cod_Sancion = "";
        Sanciones instance = new Sanciones();
        instance.setCod_Sancion(Cod_Sancion);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodEncargado method, of class Sanciones.
     */
    @Test
    public void testGetCodEncargado() {
        System.out.println("getCodEncargado");
        Sanciones instance = new Sanciones();
        String expResult = "";
        String result = instance.getCodEncargado();
 //       assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodEncargado method, of class Sanciones.
     */
    @Test
    public void testSetCodEncargado() {
        System.out.println("setCodEncargado");
        String CodEncargado = "";
        Sanciones instance = new Sanciones();
        instance.setCodEncargado(CodEncargado);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCod_Sanc method, of class Sanciones.
     */
    @Test
    public void testGetCod_Sanc() {
        System.out.println("getCod_Sanc");
        Sanciones instance = new Sanciones();
        String expResult = "";
        String result = instance.getCod_Sanc();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_Sanc method, of class Sanciones.
     */
    @Test
    public void testSetCod_Sanc() {
        System.out.println("setCod_Sanc");
        String Cod_Sanc = "";
        Sanciones instance = new Sanciones();
        instance.setCod_Sanc(Cod_Sanc);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodLector method, of class Sanciones.
     */
    @Test
    public void testGetCodLector() {
        System.out.println("getCodLector");
        Sanciones instance = new Sanciones();
        String expResult = "";
        String result = instance.getCodLector();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodLector method, of class Sanciones.
     */
    @Test
    public void testSetCodLector() {
        System.out.println("setCodLector");
        String CodLector = "";
        Sanciones instance = new Sanciones();
        instance.setCodLector(CodLector);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDes_Sancion method, of class Sanciones.
     */
    @Test
    public void testGetDes_Sancion() {
        System.out.println("getDes_Sancion");
        Sanciones instance = new Sanciones();
        String expResult = "";
        String result = instance.getDes_Sancion();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDes_Sancion method, of class Sanciones.
     */
    @Test
    public void testSetDes_Sancion() {
        System.out.println("setDes_Sancion");
        String Des_Sancion = "";
        Sanciones instance = new Sanciones();
        instance.setDes_Sancion(Des_Sancion);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCod_Reporte method, of class Sanciones.
     */
    @Test
    public void testGetCod_Reporte() {
        System.out.println("getCod_Reporte");
        Sanciones instance = new Sanciones();
        String expResult = "";
        String result = instance.getCod_Reporte();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_Reporte method, of class Sanciones.
     */
    @Test
    public void testSetCod_Reporte() {
        System.out.println("setCod_Reporte");
        String Cod_Reporte = "";
        Sanciones instance = new Sanciones();
        instance.setCod_Reporte(Cod_Reporte);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaSanciones method, of class Sanciones.
     */
    @Test
    public void testListaSanciones() {
        System.out.println("listaSanciones");
        Sanciones instance = new Sanciones();
        LinkedList<Sanciones> expResult = null;
        LinkedList<Sanciones> result = instance.listaSanciones();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarSanciones method, of class Sanciones.
     */
    @Test
    public void testAgregarSanciones() {
        System.out.println("agregarSanciones");
        String Cod_Sancion = "";
        String Cod_Reporte = "";
        String Cod_Sanc = "";
        String CodEncargado = "";
        String CodLector = "";
        String Des_Sancion = "";
        Sanciones instance = new Sanciones();
        instance.agregarSanciones(Cod_Sancion, Cod_Reporte, Cod_Sanc, CodEncargado, CodLector, Des_Sancion);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of editarSanciones method, of class Sanciones.
     */
    @Test
    public void testEditarSanciones() {
        System.out.println("editarSanciones");
        String Cod_Sancion = "";
        String Cod_Reporte = "";
        String Cod_Sanc = "";
        String CodEncargado = "";
        String CodLector = "";
        String Des_Sancion = "";
        Sanciones instance = new Sanciones();
        instance.editarSanciones(Cod_Sancion, Cod_Reporte, Cod_Sanc, CodEncargado, CodLector, Des_Sancion);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarSanciones method, of class Sanciones.
     */
    @Test
    public void testEliminarSanciones() {
        System.out.println("eliminarSanciones");
        String Cod_Sancion = "";
        Sanciones instance = new Sanciones();
        instance.eliminarSanciones(Cod_Sancion);
        // TODO review the generated test code and remove the default call to fail.
 //       fail("The test case is a prototype.");
    }
    
}

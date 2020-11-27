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
public class PrestamoTest {
    
    public PrestamoTest() {
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
     * Test of getCodPrestamo method, of class Prestamo.
     */
    @Test
    public void testGetCodPrestamo() {
        System.out.println("getCodPrestamo");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getCodPrestamo();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodLector method, of class Prestamo.
     */
    @Test
    public void testGetCodLector() {
        System.out.println("getCodLector");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getCodLector();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodLector method, of class Prestamo.
     */
    @Test
    public void testSetCodLector() {
        System.out.println("setCodLector");
        String CodLector = "";
        Prestamo instance = new Prestamo();
        instance.setCodLector(CodLector);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodPrestamo method, of class Prestamo.
     */
    @Test
    public void testSetCodPrestamo() {
        System.out.println("setCodPrestamo");
        String CodPrestamo = "";
        Prestamo instance = new Prestamo();
        instance.setCodPrestamo(CodPrestamo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodMate_biblio method, of class Prestamo.
     */
    @Test
    public void testGetCodMate_biblio() {
        System.out.println("getCodMate_biblio");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getCodMate_biblio();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodMate_biblio method, of class Prestamo.
     */
    @Test
    public void testSetCodMate_biblio() {
        System.out.println("setCodMate_biblio");
        String CodMate_biblio = "";
        Prestamo instance = new Prestamo();
        instance.setCodMate_biblio(CodMate_biblio);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getFpPrestamo method, of class Prestamo.
     */
    @Test
    public void testGetFpPrestamo() {
        System.out.println("getFpPrestamo");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getFpPrestamo();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setFpPrestamo method, of class Prestamo.
     */
    @Test
    public void testSetFpPrestamo() {
        System.out.println("setFpPrestamo");
        String FpPrestamo = "";
        Prestamo instance = new Prestamo();
        instance.setFpPrestamo(FpPrestamo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getFePrestamo method, of class Prestamo.
     */
    @Test
    public void testGetFePrestamo() {
        System.out.println("getFePrestamo");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getFePrestamo();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setFePrestamo method, of class Prestamo.
     */
    @Test
    public void testSetFePrestamo() {
        System.out.println("setFePrestamo");
        String FePrestamo = "";
        Prestamo instance = new Prestamo();
        instance.setFePrestamo(FePrestamo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getStaPrestamo method, of class Prestamo.
     */
    @Test
    public void testGetStaPrestamo() {
        System.out.println("getStaPrestamo");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getStaPrestamo();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setStaPrestamo method, of class Prestamo.
     */
    @Test
    public void testSetStaPrestamo() {
        System.out.println("setStaPrestamo");
        String StaPrestamo = "";
        Prestamo instance = new Prestamo();
        instance.setStaPrestamo(StaPrestamo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodBiblio method, of class Prestamo.
     */
    @Test
    public void testGetCodBiblio() {
        System.out.println("getCodBiblio");
        Prestamo instance = new Prestamo();
        String expResult = "";
        String result = instance.getCodBiblio();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodBiblio method, of class Prestamo.
     */
    @Test
    public void testSetCodBiblio() {
        System.out.println("setCodBiblio");
        String CodBiblio = "";
        Prestamo instance = new Prestamo();
        instance.setCodBiblio(CodBiblio);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of listaPrestamo method, of class Prestamo.
     */
    @Test
    public void testListaPrestamo() {
        System.out.println("listaPrestamo");
        Prestamo instance = new Prestamo();
        LinkedList<Prestamo> expResult = null;
        LinkedList<Prestamo> result = instance.listaPrestamo();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPrestamo method, of class Prestamo.
     */
    @Test
    public void testAgregarPrestamo() {
        System.out.println("agregarPrestamo");
        String CodPrestamo = "";
        String FePrestamo = "";
        String FpPrestamo = "";
        String CodMate_biblio = "";
        String CodLector = "";
        String StaPrestamo = "";
        Prestamo instance = new Prestamo();
        instance.agregarPrestamo(CodPrestamo, FePrestamo, FpPrestamo, CodMate_biblio, CodLector, StaPrestamo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of editarPrestamo method, of class Prestamo.
     */
    @Test
    public void testEditarPrestamo() {
        System.out.println("editarPrestamo");
        String CodPrestamo = "";
        String FePrestamo = "";
        String FpPrestamo = "";
        String MatPrestamo = "";
        String CodLector = "";
        String StaPrestamo = "";
        Prestamo instance = new Prestamo();
        instance.editarPrestamo(CodPrestamo, FePrestamo, FpPrestamo, MatPrestamo, CodLector, StaPrestamo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPrestamo method, of class Prestamo.
     */
    @Test
    public void testEliminarPrestamo() {
        System.out.println("eliminarPrestamo");
        String CodPrestamo = "";
        String StaPrestamo = "";
        Prestamo instance = new Prestamo();
        instance.eliminarPrestamo(CodPrestamo, StaPrestamo);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

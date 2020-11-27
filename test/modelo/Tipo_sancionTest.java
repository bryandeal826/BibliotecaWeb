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
public class Tipo_sancionTest {
    
    public Tipo_sancionTest() {
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
     * Test of getCod_Sanc method, of class Tipo_sancion.
     */
    @Test
    public void testGetCod_Sanc() {
        System.out.println("getCod_Sanc");
        Tipo_sancion instance = new Tipo_sancion();
        String expResult = "";
        String result = instance.getCod_Sanc();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_Sanc method, of class Tipo_sancion.
     */
    @Test
    public void testSetCod_Sanc() {
        System.out.println("setCod_Sanc");
        String Cod_Sanc = "";
        Tipo_sancion instance = new Tipo_sancion();
        instance.setCod_Sanc(Cod_Sanc);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDes_Sanc method, of class Tipo_sancion.
     */
    @Test
    public void testGetDes_Sanc() {
        System.out.println("getDes_Sanc");
        Tipo_sancion instance = new Tipo_sancion();
        String expResult = "";
        String result = instance.getDes_Sanc();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDes_Sanc method, of class Tipo_sancion.
     */
    @Test
    public void testSetDes_Sanc() {
        System.out.println("setDes_Sanc");
        String Des_Sanc = "";
        Tipo_sancion instance = new Tipo_sancion();
        instance.setDes_Sanc(Des_Sanc);
        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
    }

    /**
     * Test of getPag_Sanc method, of class Tipo_sancion.
     */
    @Test
    public void testGetPag_Sanc() {
        System.out.println("getPag_Sanc");
        Tipo_sancion instance = new Tipo_sancion();
        double expResult = 0.0;
        double result = instance.getPag_Sanc();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPag_Sanc method, of class Tipo_sancion.
     */
    @Test
    public void testSetPag_Sanc() {
        System.out.println("setPag_Sanc");
        double Pag_Sanc = 0.0;
        Tipo_sancion instance = new Tipo_sancion();
        instance.setPag_Sanc(Pag_Sanc);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of listaTipo_sancion method, of class Tipo_sancion.
     */
    @Test
    public void testListaTipo_sancion() {
        System.out.println("listaTipo_sancion");
        Tipo_sancion instance = new Tipo_sancion();
        LinkedList<Tipo_sancion> expResult = null;
        LinkedList<Tipo_sancion> result = instance.listaTipo_sancion();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarTipo_sancion method, of class Tipo_sancion.
     */
    @Test
    public void testAgregarTipo_sancion() {
        System.out.println("agregarTipo_sancion");
        String Cod_Sanc = "";
        String Des_Sanc = "";
        String Pag_Sanc = "";
        Tipo_sancion instance = new Tipo_sancion();
        instance.agregarTipo_sancion(Cod_Sanc, Des_Sanc, Pag_Sanc);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of editarTipo_sancion method, of class Tipo_sancion.
     */
    @Test
    public void testEditarTipo_sancion() {
        System.out.println("editarTipo_sancion");
        String Cod_Sanc = "";
        String Des_Sanc = "";
        String Pag_Sanc = "";
        Tipo_sancion instance = new Tipo_sancion();
        instance.editarTipo_sancion(Cod_Sanc, Des_Sanc, Pag_Sanc);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarTipo_sancion method, of class Tipo_sancion.
     */
    @Test
    public void testEliminarTipo_sancion() {
        System.out.println("eliminarTipo_sancion");
        String Cod_Sanc = "";
        Tipo_sancion instance = new Tipo_sancion();
        instance.eliminarTipo_sancion(Cod_Sanc);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

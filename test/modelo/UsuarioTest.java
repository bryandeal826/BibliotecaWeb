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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getCodUsuario method, of class Usuario.
     */
    @Test
    public void testGetCodUsuario() {
        System.out.println("getCodUsuario");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCodUsuario();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodUsuario method, of class Usuario.
     */
    @Test
    public void testSetCodUsuario() {
        System.out.println("setCodUsuario");
        String CodUsuario = "";
        Usuario instance = new Usuario();
        instance.setCodUsuario(CodUsuario);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassUsuario method, of class Usuario.
     */
    @Test
    public void testGetPassUsuario() {
        System.out.println("getPassUsuario");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPassUsuario();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassUsuario method, of class Usuario.
     */
    @Test
    public void testSetPassUsuario() {
        System.out.println("setPassUsuario");
        String PassUsuario = "";
        Usuario instance = new Usuario();
        instance.setPassUsuario(PassUsuario);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipUsuario method, of class Usuario.
     */
    @Test
    public void testGetTipUsuario() {
        System.out.println("getTipUsuario");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTipUsuario();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipUsuario method, of class Usuario.
     */
    @Test
    public void testSetTipUsuario() {
        System.out.println("setTipUsuario");
        String TipUsuario = "";
        Usuario instance = new Usuario();
        instance.setTipUsuario(TipUsuario);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of autoriza method, of class Usuario.
     */
    @Test
    public void testAutoriza() {
        System.out.println("autoriza");
        String usr = "";
        String psw = "";
        String stt = "";
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.autoriza(usr, psw, stt);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }

    /**
     * Test of listaUsuario method, of class Usuario.
     */
    @Test
    public void testListaUsuario() {
        System.out.println("listaUsuario");
        Usuario instance = new Usuario();
        LinkedList<Usuario> expResult = null;
        LinkedList<Usuario> result = instance.listaUsuario();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarUsuario method, of class Usuario.
     */
    @Test
    public void testAgregarUsuario() {
        System.out.println("agregarUsuario");
        String CodUsuario = "";
        String PassUsuario = "";
        String StaUsuario = "";
        Usuario instance = new Usuario();
        instance.agregarUsuario(CodUsuario, PassUsuario, StaUsuario);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of editarUsuario method, of class Usuario.
     */
    @Test
    public void testEditarUsuario() {
        System.out.println("editarUsuario");
        String CodUsuario = "";
        String PassUsuario = "";
        String StaUsuario = "";
        Usuario instance = new Usuario();
        instance.editarUsuario(CodUsuario, PassUsuario, StaUsuario);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class Usuario.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        String CodUsuario = "";
        Usuario instance = new Usuario();
        instance.eliminarUsuario(CodUsuario);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

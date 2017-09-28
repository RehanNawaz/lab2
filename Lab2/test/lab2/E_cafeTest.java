/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shadow
 */
public class E_cafeTest {
    
    public E_cafeTest() {
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
     * Test of CurrentTime method, of class E_cafe.
     */
    @Test
    public void testCurrentTime() {
        System.out.println("CurrentTime");
        E_cafe instance = new E_cafe();
        int expResult = 0;
        int result = instance.CurrentTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class E_cafe.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        E_cafe instance = new E_cafe();
        instance.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class E_cafe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        E_cafe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

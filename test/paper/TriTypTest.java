/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test Class for TriTyp Project
 * 
 * @author Thiago Nascimento
 * @since 2015-05-13
 * @version 1.0
 */
public class TriTypTest {
    
    public TriTypTest() {
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
     * Test of setI method, of class TriTyp.
     */
    @Test
    public void testConstructor() {
        TriTyp instance = new TriTyp();
        
        // Default values
        Assert.assertEquals(0, instance.i);
        Assert.assertEquals(0, instance.j);
        Assert.assertEquals(0, instance.k);
        
        Assert.assertEquals(0, instance.trityp); 
        Assert.assertEquals(1, TriTyp.SCALENE); 
        Assert.assertEquals(2, TriTyp.ISOSCELES); 
        Assert.assertEquals(3, TriTyp.EQUILATERAL); 
        Assert.assertEquals(4, TriTyp.NOT_A_TRIANGLE);
    }

    /**
     * Test of setI method, of class TriTyp.
     */
    @Test
    public void testSetI() {
        TriTyp instance = new TriTyp();
        
        // Default values
        Assert.assertEquals(0, instance.i);
        
        // Negative values
        instance.setI(-10);        
        Assert.assertEquals(-10, instance.i);
        
        // Zero
        instance.setI(0);        
        Assert.assertEquals(0, instance.i);
        
        // Positive values
        instance.setI(10);
        Assert.assertEquals(10, instance.i);
        
        // Limit values
        instance.setI(Integer.MAX_VALUE);
        Assert.assertEquals(Integer.MAX_VALUE, instance.i);
        instance.setI(Integer.MIN_VALUE);
        Assert.assertEquals(Integer.MIN_VALUE, instance.i);
    }
    
    /**
     * Test of setI method, of class TriTyp.
     */
    @Test
    public void testSetJ() {
        TriTyp instance = new TriTyp();
        
        // Default values
        Assert.assertEquals(0, instance.j);
        
        // Negative values
        instance.setJ(-10);        
        Assert.assertEquals(-10, instance.j);
        
        // Zero
        instance.setJ(0);        
        Assert.assertEquals(0, instance.j);
        
        // Positive values
        instance.setJ(10);
        Assert.assertEquals(10, instance.j);
        
        // Limit values
        instance.setJ(Integer.MAX_VALUE);
        Assert.assertEquals(Integer.MAX_VALUE, instance.j);
        instance.setJ(Integer.MIN_VALUE);
        Assert.assertEquals(Integer.MIN_VALUE, instance.j);
    }
    
    /**
     * Test of setK method, of class TriTyp.
     */
    @Test
    public void testSetK() {
        TriTyp instance = new TriTyp();
        
        // Default values
        Assert.assertEquals(0, instance.k);
        
        // Negative values
        instance.setK(-10);        
        Assert.assertEquals(-10, instance.k);
        
        // Zero
        instance.setK(0);        
        Assert.assertEquals(0, instance.k);
        
        // Positive values
        instance.setK(10);
        Assert.assertEquals(10, instance.k);
        
        // Limit values
        instance.setK(Integer.MAX_VALUE);
        Assert.assertEquals(Integer.MAX_VALUE, instance.k);
        instance.setK(Integer.MIN_VALUE);
        Assert.assertEquals(Integer.MIN_VALUE, instance.k);
    }
//
//    /**
//     * Test of setJ method, of class TriTyp.
//     */
//    @Test
//    public void testSetJ() {
//        TriTyp instance = new TriTyp();
//        instance.setI(10);
//        instance.setJ(9);
//        instance.setK(8);
//        instance.type();
//        Assert.assertEquals(1, instance.trityp);
//    }
}

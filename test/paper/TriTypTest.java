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
     * Constructor Test 
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
     * Test of setJ method, of class TriTyp.
     */
    @Test
    public void testSetJ() {
        TriTyp instance = new TriTyp();
        
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
    
    /**
     * toSring Test 
     */
    @Test
    public void testToString() {
        TriTyp instance = new TriTyp();
        
        // Not null or empty
        Assert.assertNotNull(instance.toString());
        Assert.assertNotEquals(0, instance.toString().length());
        
        // Should be having only 0 values
        Assert.assertEquals("0-0-0: 0", instance.toString());
        
        // Should be following the same patterns
        String pattern = "[-]?\\d+-[-]?\\d+-[-]?\\d+: \\d+";
        Assert.assertTrue(instance.toString().matches(pattern));
                
        // Don't call type method
        instance = new TriTyp();
        instance.setI(1); 
        instance.setJ(1); 
        instance.setK(1);
        Assert.assertEquals("1-1-1: 0", instance.toString());
        
        // EQUILATERAL
        instance = new TriTyp();
        instance.setI(3); 
        instance.setJ(3); 
        instance.setK(3);
        instance.type();        
        Assert.assertEquals("3-3-3: 3", instance.toString());
        
        // SCALENE
        instance = new TriTyp();
        instance.setI(13); 
        instance.setJ(9); 
        instance.setK(14);
        instance.type();
        Assert.assertEquals("13-9-14: 1", instance.toString());
        
        // ISOSCELES
        instance = new TriTyp();
        instance.setI(13); 
        instance.setJ(13); 
        instance.setK(10);
        instance.type();
        Assert.assertEquals("13-13-10: 2", instance.toString());
        
        // NOT_A_TRIANGLE
        instance.setI(-3); 
        instance.setJ(3); 
        instance.setK(3);
        instance.type();
        
        Assert.assertEquals("-3-3-3: 4", instance.toString());        
    }
}

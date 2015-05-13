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

	@Test
	public void testConstructorForIVariable() {
		TriTyp instance = new TriTyp();
		Assert.assertEquals(0, instance.i);
	}

	@Test
	public void testConstructorForJVariable() {
		TriTyp instance = new TriTyp();
		Assert.assertEquals(0, instance.j);
	}

	@Test
	public void testConstructorForKVariable() {
		TriTyp instance = new TriTyp();
		Assert.assertEquals(0, instance.k);
	}

	@Test
	public void testConstructorForTriTypVariable() {
		TriTyp instance = new TriTyp();
		Assert.assertEquals(0, instance.trityp);
	}

	@Test
	public void testStaticValuesScalene() {
		Assert.assertEquals(1, TriTyp.SCALENE);
	}

	@Test
	public void testStaticValuesIsosceles() {
		Assert.assertEquals(2, TriTyp.ISOSCELES);
	}

	@Test
	public void testStaticValuesEquilateral() {
		Assert.assertEquals(3, TriTyp.EQUILATERAL);
	}

	@Test
	public void testStaticValuesNotATriangle() {
		Assert.assertEquals(4, TriTyp.NOT_A_TRIANGLE);
	}

	@Test
	public void testeSetIForNegativeValues() {
		TriTyp instance = new TriTyp();
		instance.setI(-10);
		Assert.assertEquals(-10, instance.i);
	}

	@Test
	public void testeSetIForZeroValues() {
		TriTyp instance = new TriTyp();
		instance.setI(0);
		Assert.assertEquals(0, instance.i);
	}

	@Test
	public void testeSetIForPositiveValues() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
		Assert.assertEquals(10, instance.i);
	}

	@Test
	public void testeSetIForMaxIntegerValues() {
		TriTyp instance = new TriTyp();
		instance.setI(Integer.MAX_VALUE);
		Assert.assertEquals(Integer.MAX_VALUE, instance.i);
	}

	@Test
	public void testeSetIForMinIntegerValues() {
		TriTyp instance = new TriTyp();
		instance.setI(Integer.MIN_VALUE);
		Assert.assertEquals(Integer.MIN_VALUE, instance.i);
	}

	@Test
	public void testeSetJForNegativeValues() {
		TriTyp instance = new TriTyp();
		instance.setJ(-10);
		Assert.assertEquals(-10, instance.j);
	}

	@Test
	public void testeSetJForZeroValues() {
		TriTyp instance = new TriTyp();
		instance.setJ(0);
		Assert.assertEquals(0, instance.j);
	}

	@Test
	public void testeSetJForPositiveValues() {
		TriTyp instance = new TriTyp();
		instance.setJ(10);
		Assert.assertEquals(10, instance.j);
	}

	@Test
	public void testeSetJForMaxIntegerValues() {
		TriTyp instance = new TriTyp();
		instance.setJ(Integer.MAX_VALUE);
		Assert.assertEquals(Integer.MAX_VALUE, instance.j);
	}

	@Test
	public void testeSetJForMinIntegerValues() {
		TriTyp instance = new TriTyp();
		instance.setJ(Integer.MIN_VALUE);
		Assert.assertEquals(Integer.MIN_VALUE, instance.j);
	}

	@Test
	public void testeSetKForNegativeValues() {
		TriTyp instance = new TriTyp();
		instance.setK(-10);
		Assert.assertEquals(-10, instance.k);
	}

	@Test
	public void testeSetKForZeroValues() {
		TriTyp instance = new TriTyp();
		instance.setK(0);
		Assert.assertEquals(0, instance.k);
	}

	@Test
	public void testeSetKForPositiveValues() {
		TriTyp instance = new TriTyp();
		instance.setK(10);
		Assert.assertEquals(10, instance.k);
	}

	@Test
	public void testeSetKForMaxIntegerValues() {
		TriTyp instance = new TriTyp();
		instance.setK(Integer.MAX_VALUE);
		Assert.assertEquals(Integer.MAX_VALUE, instance.k);
	}

	@Test
	public void testeSetKForMinIntegerValues() {
		TriTyp instance = new TriTyp();
		instance.setK(Integer.MIN_VALUE);
		Assert.assertEquals(Integer.MIN_VALUE, instance.k);
	}

	@Test
	public void testToStringDontCallTypeMethod() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(1);
		instance.setJ(1);
		instance.setK(1);
		Assert.assertEquals("1-1-1: 0", instance.toString());
	}

	@Test
	public void testToStringNotNull() {
		TriTyp instance = new TriTyp();
		Assert.assertNotNull(instance.toString());
	}

	@Test
	public void testToStringNotEmpty() {
		TriTyp instance = new TriTyp();
		Assert.assertNotEquals(0, instance.toString().length());
	}

	@Test
	public void testToStringShouldBeHavingOnlyZeroValues() {
		TriTyp instance = new TriTyp();
		Assert.assertEquals("0-0-0: 0", instance.toString());
	}

	@Test
	public void testToStringShouldBeHavingTheSamePatterns() {
		TriTyp instance = new TriTyp();
		String pattern = "[-]?\\d+-[-]?\\d+-[-]?\\d+: \\d+";
		instance.setI(1);
		instance.setJ(2);
		instance.setK(3);
		Assert.assertTrue(instance.toString().matches(pattern));
		instance.setI(1);
		instance.setJ(-2);
		instance.setK(3);
		Assert.assertTrue(instance.toString().matches(pattern));
	}

	@Test
	public void testEqualsWithSameIValue() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne = new TriTyp();
		instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceTwo.setI(1);
		Assert.assertTrue(instanceOne.equals(instanceTwo));
		Assert.assertTrue(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWithSameJValue() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne = new TriTyp();
		instanceTwo = new TriTyp();
		instanceOne.setJ(2);
		instanceTwo.setJ(2);
		Assert.assertTrue(instanceOne.equals(instanceTwo));
		Assert.assertTrue(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWithSameKValue() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne = new TriTyp();
		instanceTwo = new TriTyp();
		instanceOne.setK(3);
		instanceTwo.setK(3);
		Assert.assertTrue(instanceOne.equals(instanceTwo));
		Assert.assertTrue(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWithSameValuesNoTypeMethod() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceTwo.setI(1);
		instanceTwo.setJ(2);
		instanceTwo.setK(3);
		Assert.assertTrue(instanceOne.equals(instanceTwo));
		Assert.assertTrue(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWithSameValuesWithTypeMethod() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(1);
		instanceTwo.setJ(2);
		instanceTwo.setK(3);
		instanceTwo.type();
		Assert.assertTrue(instanceOne.equals(instanceTwo));
		Assert.assertTrue(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWithDifferentValuesNoTypeMethod() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceTwo.setI(3);
		instanceTwo.setJ(2);
		instanceTwo.setK(1);
		Assert.assertFalse(instanceOne.equals(instanceTwo));
		Assert.assertFalse(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWithDifferentValuesWithTypeMethod() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type();
		instanceTwo.setI(3);
		instanceTwo.setJ(2);
		instanceTwo.setK(1);
		instanceTwo.type();
		Assert.assertFalse(instanceOne.equals(instanceTwo));
		Assert.assertFalse(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWithObject() {
		TriTyp instance = new TriTyp();
		Assert.assertFalse(instance.equals(new Object()));
	}

	@Test
	public void testEqualsWithNullValue() {
		TriTyp instance = new TriTyp();
		Assert.assertFalse(instance.equals(null));
	}

	@Test
	public void testEqualsDefaultInitialization() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		Assert.assertTrue(instanceOne.equals(instanceTwo));
		Assert.assertTrue(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testEqualsWhereOnlyOneHasTypeMethod() {
		TriTyp instanceOne = new TriTyp();
		TriTyp instanceTwo = new TriTyp();
		instanceOne.setI(1);
		instanceOne.setJ(2);
		instanceOne.setK(3);
		instanceOne.type(); // Only this
		instanceTwo.setI(1);
		instanceTwo.setJ(2);
		instanceTwo.setK(3);
		Assert.assertFalse(instanceOne.equals(instanceTwo));
		Assert.assertFalse(instanceTwo.equals(instanceOne));
	}

	@Test
	public void testTypeNotATriangleDefaultValues() {
		TriTyp instance = new TriTyp();
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}

	@Test
	public void testTypeNotATriangleWithINegative() {
		TriTyp instance = new TriTyp();
		instance.setI(-1);
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}

	@Test
	public void testTypeNotATriangleWithJNegative() {
		TriTyp instance = new TriTyp();
		instance.setJ(-1);
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}
	
	@Test
	public void testTypeNotATriangleWithKNegative() {
		TriTyp instance = new TriTyp();
		instance.setK(-1);
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}

	@Test
	public void testTypeNotATriangleWithInvalidSum() {
		TriTyp instance = new TriTyp();
		instance.setI(10);
		instance.setJ(4);
		instance.setK(3);
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}
	
	@Test
	public void testTypeEquilateralTriangle() {
		TriTyp instance = new TriTyp();
		instance.setI(20);
		instance.setJ(20);
		instance.setK(20);
		instance.type();
		Assert.assertEquals(3, instance.trityp);
	}

	@Test
	public void testTypeScaleneTriangle() {
		TriTyp instance = new TriTyp();
		instance.setI(13);
		instance.setJ(9);
		instance.setK(14);
		instance.type();
		Assert.assertEquals(1, instance.trityp);
	}
	
	@Test
	public void testTypeIsoscelesTriangleSameIAndJ() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(13);
		instance.setJ(13);
		instance.setK(10);
		instance.type();
		Assert.assertEquals(2, instance.trityp);
	}

	@Test
	public void testTypeIsoscelesTriangleSameIAndK() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(13);
		instance.setJ(10);
		instance.setK(13);
		instance.type();
		Assert.assertEquals(2, instance.trityp);
	}

	@Test
	public void testTypeIsoscelesTriangleSameJAndK() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(10);
		instance.setJ(13);
		instance.setK(13);
		instance.type();
		Assert.assertEquals(2, instance.trityp);
	}
	
	@Test
	public void testTypeShouldntReplaceIJKValuesAfterCallType() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(3);
		instance.setJ(4);
		instance.setK(5);
		instance.type();
		Assert.assertEquals(3, instance.i);
		Assert.assertEquals(4, instance.j);
		Assert.assertEquals(5, instance.k);
	}
	
	@Test
	public void testTypeLastElseWithJEqualsK() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(2);
		instance.setJ(1);
		instance.setK(1);
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}
	
	@Test
	public void testTypeLastElseWithIEqualsK() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(1);
		instance.setJ(2);
		instance.setK(1);
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}
	
	@Test
	public void testTypeLastElseWithIEqualsJ() {
		TriTyp instance = new TriTyp();
		instance = new TriTyp();
		instance.setI(1);
		instance.setJ(1);
		instance.setK(2);
		instance.type();
		Assert.assertEquals(4, instance.trityp);
	}
	
}

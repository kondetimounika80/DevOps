package com.mounika;
   import junit.framework.*;
   import org.junit.Test;
  public class TestCalculator {
	  @SuppressWarnings("deprecation")
	@Test
      public void testsum() {
	    Calculator test = new Calculator();
	    int result = test.sum(10, 20);
	    Assert.assertEquals(30, result);
	    }
	  @SuppressWarnings("deprecation")
	  @Test
	public void testsub() {
		  Calculator test = new Calculator();
		  int result = test.sub(10, 20);
		  Assert.assertEquals(-10, result);
		    }
	  @SuppressWarnings("deprecation")
	  @Test
	public void testmul() {
		    Calculator test = new Calculator();
		    int result = test.mul(10, 20);
		    Assert.assertEquals(200 , result);
		    }
	  @SuppressWarnings("deprecation")
	  @Test
	public void testdivide() {
		    Calculator test = new Calculator();
		    int result = test.divide(10, 20);
		    Assert.assertEquals(0, result);
		    }
	    
	}



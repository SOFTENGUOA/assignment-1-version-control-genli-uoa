/**
 * 
 */
package se283.a1.t2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import se283.a1.t1.Counter;

/**
 * Test class for Counter class
 * @author Gen Li
 * @version 13/08/2021
 *
 */
class CounterTest {

	/**
	 * Test method for {@link se283.a1.t1.Counter#increment()}.
	 */
	@Test
	void testIncrementFromNegativeToNegative() {
        Counter counter = new Counter();
        counter._ctr = -2;
 
        counter.increment();

        assertEquals(-1, counter._ctr, "The counter's value is -2 before method increment executes, so the value should be -1 after it has executed.");
    }

	/**
	 * Test method for {@link se283.a1.t1.Counter#increment()}.
	 */
	@Test
	void testIncrementFromNegativeToZero() {
        Counter counter = new Counter();
        counter._ctr = -1;
 
        counter.increment();

        assertEquals(0, counter._ctr, "The counter's value is -1 before method increment executes, so the value should be 0 after it has executed.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#increment()}.
	 */
	@Test
	void testIncrementFromZeroToPositive() {
        Counter counter = new Counter();
        counter._ctr = 0;
 
        counter.increment();

        assertEquals(1, counter._ctr, "The counter's value is 0 before method increment executes, so the value should be 1 after it has executed.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#increment()}.
	 */
	@Test
	void testIncrementFromPositiveToPositive() {
        Counter counter = new Counter();
        counter._ctr = 1;
 
        counter.increment();

        assertEquals(2, counter._ctr, "The counter's value is 1 before method increment executes, so the value should be 2 after it has executed.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#decrement()}.
	 */
	@Test
	void testDecrementFromPositiveToPositive() {
		Counter counter = new Counter();
        counter._ctr = 2;
       
        counter.decrement();

        assertEquals(1, counter._ctr, "The counter's value is 2 before method decrement executes, so the value should be 1 after it has executed.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#decrement()}.
	 */
	@Test
	void testDecrementFromPositiveToZero() {
		Counter counter = new Counter();
        counter._ctr = 1;
       
        counter.decrement();

        assertEquals(0, counter._ctr, "The counter's value is 1 before method decrement executes, so the value should be 0 after it has executed.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#decrement()}.
	 */
	@Test
	void testDecrementFromZeroToNegative() {
		Counter counter = new Counter();
        counter._ctr = 0;
       
        counter.decrement();

        assertEquals(-1, counter._ctr, "The counter's value is 0 before method decrement executes, so the value should be -1 after it has executed.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#decrement()}.
	 */
	@Test
	void testDecrementFromNegativeToNegative() {
		Counter counter = new Counter();
        counter._ctr = -1;
       
        counter.decrement();

        assertEquals(-2, counter._ctr, "The counter's value is -1 before method decrement executes, so the value should be -2 after it has executed.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#reset()}.
	 */
	@Test
	void testResetFromNegative() {
		Counter counter = new Counter();
        counter._ctr = -1;        

        counter.reset();

        assertEquals(0, counter._ctr, "The counter's value should be 0 after having executed method reset.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#reset()}.
	 */
	@Test
	void testResetFromZero() {
		Counter counter = new Counter();
        counter._ctr = 0;        

        counter.reset();

        assertEquals(0, counter._ctr, "The counter's value should be 0 after having executed method reset.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#reset()}.
	 */
	@Test
	void testResetFromPositive() {
		Counter counter = new Counter();
        counter._ctr = 1;
        
        counter.reset();

        assertEquals(0, counter._ctr, "The counter's value should be 0 after having executed method reset.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByNegativeAndNegative() {
		Counter counter = new Counter();         
        counter._ctr = -1;
        
        counter.multiplyBy(-1);

        assertEquals(1, counter._ctr, "The counter's value is -1 before method multiplyBy executes with argument -1, so the value should be 1 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByNegativeAndZero() {
		Counter counter = new Counter();         
        counter._ctr = -1;
        
        counter.multiplyBy(0);

        assertEquals(0, counter._ctr, "The counter's value is -1 before method multiplyBy executes with argument 0, so the value should be 0 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByNegativeAndPositive() {
		Counter counter = new Counter();         
        counter._ctr = -1;
        
        counter.multiplyBy(1);

        assertEquals(-1, counter._ctr, "The counter's value is -1 before method multiplyBy executes with argument 1, so the value should be -1 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByZeroAndNegative() {
		Counter counter = new Counter();         
        counter._ctr = 0;
        
        counter.multiplyBy(-1);

        assertEquals(0, counter._ctr, "The counter's value is 0 before method multiplyBy executes with argument -1, so the value should be 0 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByZeroAndZero() {
		Counter counter = new Counter();         
        counter._ctr = 0;
        
        counter.multiplyBy(0);

        assertEquals(0, counter._ctr, "The counter's value is 0 before method multiplyBy executes with argument 0, so the value should be 0 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByZeroAndPositive() {
		Counter counter = new Counter();         
        counter._ctr = 0;
        
        counter.multiplyBy(1);

        assertEquals(0, counter._ctr, "The counter's value is 0 before method multiplyBy executes with argument 1, so the value should be 0 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByPositiveAndNegative() {
		Counter counter = new Counter();         
        counter._ctr = 1;
        
        counter.multiplyBy(-1);

        assertEquals(-1, counter._ctr, "The counter's value is 1 before method multiplyBy executes with argument -1, so the value should be -1 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByPositiveAndZero() {
		Counter counter = new Counter();         
        counter._ctr = 1;
        
        counter.multiplyBy(0);

        assertEquals(0, counter._ctr, "The counter's value is 1 before method multiplyBy executes with argument 0, so the value should be 0 after the method has done so.");
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}.
	 */
	@Test
	void testMultiplyByPositiveAndPositive() {
		Counter counter = new Counter();         
        counter._ctr = 1;
        
        counter.multiplyBy(1);

        assertEquals(1, counter._ctr, "The counter's value is 1 before method multiplyBy executes with argument 1, so the value should be 1 after the method has done so.");
	}
}

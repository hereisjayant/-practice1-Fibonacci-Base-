package fibbase;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibBaseTest {

	@Test
	public void test1() {
		assertEquals(1, FibBase.ySum(1, 1));
	}

	@Test
	public void test2() {
		assertEquals(3, FibBase.ySum(1, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(7, FibBase.ySum(1, 3));
	}

	@Test
	public void test4() {
		assertEquals(12, FibBase.ySum(1, 4));
	}

	@Test
	public void test5() {
		assertEquals(20, FibBase.ySum(1, 5));
	}

	@Test
	public void test6(){
		FibBase newob = new FibBase();
		assertEquals(13,newob.getMaxFib(14));
	}

}

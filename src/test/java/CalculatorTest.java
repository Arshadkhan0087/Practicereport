import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.miit.Calculator;

public class CalculatorTest {
@Test
public void testAdd() {
	assertEquals(6,Calculator.add(2,4));
}
@Test
public void testSub() {
	assertEquals(2,Calculator.sub(4,2));
	
}
@Test
public void testmul() {
	assertEquals(8,Calculator.mul(2,4));
}

@Test
public void testdiv() {
	assertEquals(2,Calculator.div(8,4));
}
}

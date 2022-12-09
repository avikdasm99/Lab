
import static org.junit.Assert.assertEquals;
import org.junit.Test;

class EvenOdd{
	static boolean EvenOdd(int a) {
		if(a%2==0) { return true; }
		else { return false; }
	}
}
public class EvenOddTestUsingJUnit {
	@Test
	public void test1() {
		assertEquals(true,EvenOdd.EvenOdd(12));
	}
	@Test
	public void test2() {
		assertEquals(true,EvenOdd.EvenOdd(5));
	}
}
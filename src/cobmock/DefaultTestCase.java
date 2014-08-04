package cobmock;
import static org.junit.Assert.*;

import org.junit.Test;


public class DefaultTestCase {

	@Test
	public final void test() {
		Testclass t = new Testclass();
		t.testSysout();
	}

}

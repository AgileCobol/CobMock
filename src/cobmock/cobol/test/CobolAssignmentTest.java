package cobmock.cobol.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cobmock.config.CobolAssignment;

public class CobolAssignmentTest {

	@Test
	public void checkLineLength() {
		CobolAssignment assign = new CobolAssignment();
		assign.setSource("SOME REAL LONG DATAITEM IN AN EVEN LONGER QUALIFIER WITH SOME SPACES IN BETWEEN");
		assign.setTarget("short target");
		System.out.println(assign.getSource());
		System.out.println(assign.getTarget());
	}

}

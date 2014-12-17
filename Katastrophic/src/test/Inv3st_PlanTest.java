package test;

import static org.junit.Assert.*;
import main.Inv3st_Plan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Inv3st_PlanTest {

	private static String input1;
	private static String input2;
	private static String input3;
	

	@Before
	public void setUp() throws Exception {
		input1 = "1000 100 100 100 100 100 100 100 100 100 100 100 100 100"
				+ "1000 100 100 100 100 100 100 100 100 100 100 100 100 100"
				+ "1000 100 100 100 100 100 100 100 100 100 100 100 100 100"
				+ "1000 100 100 100 100 100 100 100 100 100 100 100 100 100"
				+ "2000 200 100 100 100 100 100 100 100 100 100 100 100 100";
		input2 = "100 105 110 120 130 140 150 160 170 180 190 200 210 220";
		input3 = "1000 1000 1000 100 100 100 100 100 100 100 100 100 100 100";
				
	}

	@Test
	public void testInput() {
		Inv3st_Plan inv1 = Inv3st_Plan.input(input1);
				
		String expectedOutput = "Case #1: 1 12 1000900\n"+
								"Case #2: 1 12 1000900\n"+
								"Case #3: 1 12 1000900\n"+
								"Case #4: 1 12 1001900\n"+
								"Case #5: IMPOSSIBLE";
				
		System.out.println(inv1.output());
		assertEquals(expectedOutput, inv1.output());
	}


}

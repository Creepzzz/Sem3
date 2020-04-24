package se.kth.iv1350.amazingpos.view;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.amazingpos.controller.*;
class viewTest {
	
	private view instanceToTest;
	private ByteArrayOutputStream printout;
	private PrintStream originalSystemOut;
	
	@BeforeEach
	public void setUp() {
		Controller ctrl = new Controller();
		instanceToTest = new view(ctrl);
		
		printout = new ByteArrayOutputStream();
		PrintStream inMemSysOut = new PrintStream(printout);
		originalSystemOut = System.out;
		System.setOut(inMemSysOut);
	}
	
	@AfterEach
	public void tearDown() {
		instanceToTest = null;
		
		printout = null;
		System.setOut(originalSystemOut);
	}

	@Test
	public void testRunFakeExecution() {
		instanceToTest.runFakeExecution();
		String printouts = printout.toString();
		String expectedOutput = "started";
		assertTrue(printouts.contains(expectedOutput), "UI interface did not start correctly.");
		
	}

}

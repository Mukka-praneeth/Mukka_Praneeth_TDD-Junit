package coom.epam.TddAndJTest;

import static org.junit.jupiter.api.Assertions. *;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class DeleteAat2PosTest {
	DeleteAsAt1st2Pos DeleteAsAt1st2ndPosObject;
	@BeforeEach
	void beforeinvoke()
	{
		DeleteAsAt1st2ndPosObject = new DeleteAsAt1st2Pos();
	}
	
	@Test
	void testAat1stPos() {
		assertEquals("BCD",DeleteAsAt1st2ndPosObject.checkDelete("ABCD"));
	}
	@Test
	void testAat1st_2ndPos() {
		assertEquals("CD",DeleteAsAt1st2ndPosObject.checkDelete("AACD"));
	}
	@Test
	void testAat2ndPos() {
		assertEquals("BCD",DeleteAsAt1st2ndPosObject.checkDelete("BACD"));
	}
	@Test
	void testallAs() {
		assertEquals("AA",DeleteAsAt1st2ndPosObject.checkDelete("AAAA"));
	}
	@Test
	void testnoAat1st_2nd() {
		assertEquals("BBAA",DeleteAsAt1st2ndPosObject.checkDelete("BBAA"));
	}
	@Test
	void teststringOfLen1() {
		assertEquals("",DeleteAsAt1st2ndPosObject.checkDelete("A"));
	}
	@Test
	void testemptystring() {
		assertEquals("",DeleteAsAt1st2ndPosObject.checkDelete(""));
	}
	
}
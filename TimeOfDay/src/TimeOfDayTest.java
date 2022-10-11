import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay testClass = new TimeOfDay(17,25);
		assertEquals(17,testClass.getHours());
		assertEquals(25,testClass.getMinutes());
		testClass.setHours(5);
		testClass.setMinutes(59);
		assertEquals(5,testClass.getHours());
		assertEquals(59,testClass.getMinutes());
		
		testClass.setMinutesSinceMidnight(13*60);
		assertEquals(13,testClass.getHours());
		assertEquals(0,testClass.getMinutes());
	}

}

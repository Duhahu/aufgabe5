package de.hfu;
import org.junit.Test;

public class UtilTest {
	
	@Test(expected=IllegalArgumentException.class)
    public void testUtilCase() {
		
		Util.istErstesHalbjahr(20);
}
}
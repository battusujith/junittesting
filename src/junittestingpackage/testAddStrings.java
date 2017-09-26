package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		junitfunction junitString=new junitfunction();
		String result=junitString.addStrings("sujith","maxi");
		assertEquals("sujithmaxi",result);
	}
	
	

}

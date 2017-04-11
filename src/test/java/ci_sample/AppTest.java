package ci_sample;

import com.sample.krishna.App;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	public void testAdd() {
		App app = new App();		
		assertEquals(app.add(10, 20), 30);
	}
	
}

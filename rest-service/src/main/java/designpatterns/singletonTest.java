package designpatterns;

import org.junit.Test;
import org.junit.Assert;
public class singletonTest {

	@Test
	 public void verifyInstance() {
		 singleton s1 = singleton.getInstance();
	      singleton s2 = singleton.getInstance();
	      Assert.assertEquals(s1, s2);
	 }
}

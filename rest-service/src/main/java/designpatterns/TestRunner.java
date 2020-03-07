package designpatterns;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;	
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {	
		
		//singleton
//		Result result = JUnitCore.runClasses(singletonTest.class);					
//				for (Failure failure : result.getFailures()) {							
//	         System.out.println(failure.toString());					
//	      }		
//	      System.out.println("Result=="+result.wasSuccessful());	
		
		//factory
			Result result = JUnitCore.runClasses(FactoryTest.class);					
			for (Failure failure : result.getFailures()) {							
			     System.out.println(failure.toString());					
			  }		
			  System.out.println("Result=="+result.wasSuccessful());	
	   }
}

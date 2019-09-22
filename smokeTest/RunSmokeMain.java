package smokeTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class RunSmokeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(SmokeTest.class);
		for (Failure failure : result.getFailures()) {
     System.out.println(failure.toString());
  }
 // System.out.println("Result=="+result.wasSuccessful());

		System.out.println("System smoketest is successfull");

}
	}



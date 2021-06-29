package testowanie.lekcja1.cwiczenie1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Run {
	public static void main(String[] args) {
		
		Result res = JUnitCore.runClasses(Test.class);
		
		for(Failure f : res.getFailures())
			System.out.println(f.toString());	
	}
}

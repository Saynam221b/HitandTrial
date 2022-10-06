package testOct1_2_3_4;

import org.junit.Test;

import ques1_2_3_4.Emp1;

public class TestEmployee {
	
	@Test
	public void test() {
		Emp1 ep1= new Emp1();
		
		Thread t1 = new Thread(new Emp1());
		t1.start();
		
	}
}

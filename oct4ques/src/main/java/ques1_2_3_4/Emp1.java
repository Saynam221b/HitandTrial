package ques1_2_3_4;

public class Emp1 extends Employee implements Runnable{

	@Override
	int id() {
		// TODO Auto-generated method stub
		return 1111;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return "Saynam";
	}

	@Override
	int age() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	int salary() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	int experience() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	boolean goodFeedback() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	String fathersName() {
		// TODO Auto-generated method stub
		return "RK Sharma";
	}

	@Override
	String designation() {
		// TODO Auto-generated method stub
		return "Data Engineer";
	}
	
	public void run() {
    System.out.println("This is thread1");
		
	}
}

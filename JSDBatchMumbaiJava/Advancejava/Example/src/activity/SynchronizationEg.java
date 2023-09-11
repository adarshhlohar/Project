package activity;

public class SynchronizationEg {

	public static void main(String[] args) {
		QA q = new QA();
		Thread1 t1 = new Thread1(q);
		Thread2 t2 = new Thread2(q);
	}

}

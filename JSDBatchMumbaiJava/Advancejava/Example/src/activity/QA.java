package activity;

public class QA {
	boolean flag = false;
	synchronized void question(String msg) {
		if(flag) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag = true;
		notify();
	}
	
	synchronized void answer(String msg) {
		if(!flag) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(msg);
		flag = false;
		notify();
	}
}

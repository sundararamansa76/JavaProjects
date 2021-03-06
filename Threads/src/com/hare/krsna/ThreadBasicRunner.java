package com.hare.krsna;

class Task1 extends Thread {
	@Override
	public void run() {
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
			try {
				this.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
			Thread.yield();
			//			try {
			//				this.wait(50);
			//			} catch (InterruptedException e) {
			//				// TODO Auto-generated catch block
			//				e.printStackTrace();
			//			}
		}
		System.out.println("");
	}
}

public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Task 1

		System.out.println("Task1 on");
		Task1 task1 = new Task1();
		task1.start();
		task1.setPriority(2);

		System.out.println("Task2 on");
		Task2 task2 = new Task2();
		Thread thread1 = new Thread(task2);
		thread1.setPriority(1);
		thread1.start();
		task1.join();
		thread1.join();
		System.out.println("Taks3 on");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");


	}

}

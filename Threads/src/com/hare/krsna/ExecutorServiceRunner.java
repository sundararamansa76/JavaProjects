package com.hare.krsna;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Task " + this.number + " Started");
		for (int i = this.number * 100; i <= this.number * 100 + 99; i++) {
			System.out.print(i + "  ");
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Task " + this.number + " Done");
	}

}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService execSer = Executors.newFixedThreadPool(5);
		//		execSer.execute(new Task1());
		//		execSer.execute(new Thread(new Task2()));
		//		System.out.println("Taks3 on");
		//		for (int i = 301; i <= 399; i++) {
		//			System.out.print(i + " ");
		//		}
		//		System.out.println("");

		execSer.execute(new Task(1));
		execSer.execute(new Task(2));
		execSer.execute(new Task(3));
		execSer.execute(new Task(4));
		execSer.execute(new Task(5));
		execSer.execute(new Task(6));
		execSer.execute(new Task(7));
		execSer.execute(new Task(8));
		execSer.execute(new Task(9));
		execSer.execute(new Task(10));

		execSer.shutdown();

	}

}

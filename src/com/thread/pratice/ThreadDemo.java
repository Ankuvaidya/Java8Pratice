package com.thread.pratice;

public class ThreadDemo  extends Thread{
	
	public void run() {
		System.out.println(
	            "Thread is running created by extending to parent Thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= new Thread();
		System.out.println(t.currentThread().getName());
		ThreadDemo tt= new ThreadDemo();
		tt.start();

	}

	
}

package com.thread.pratice;

public class ThreadPratice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t= new Thread();
		System.out.println(t.currentThread().getName());
		System.out.println(t.getName());
		System.out.println(t.currentThread().getName()+" "+ t.getPriority());
		t.currentThread().join();
		System.out.println(t.currentThread().toString());
	}

}

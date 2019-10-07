package com.dev.threads;

public class MainThreadClass {

	public static void main(String[] args) {

		System.out.println("main thread started");

		System.out.println("MainThreadClass prints the value of i");

		// here we have created object of class T2 and starting its execution

		new Thread2().start(); // causes this thread to start execution of t2 class

		Thread2  t2 = new Thread2 ();
		t2.setName("Thread T2");              // giving a thread name
		t2.setPriority(2);

		// HERE WE HAVE implementing with runnable interface

		// FOR THAT WE NEED TO GIVE OBJECT OF RUNNABLE CLASS

		// we canstart execution of runnable interface like this also

		Thread3 t3 = new Thread3();
		Thread t = new Thread(t3); // here t3 is class implementing runnable interface
		t.start();
		t.setPriority(3);

		// we canstart execution of runnable interface like this also

		//new Thread(new Thread3()).start();// TO START EXECUTION OF T3 CLASS

		Thread.currentThread().setName("Main thread"); // setting a thread name to main method
		Thread.currentThread().setPriority(1);


		for (int i = 0; i <= 10; i++) {
			System.out.println("i = "+i);
		}
		// for giving name of thread
		System.out.println("threadname: "+t2.getName());  // giving a thread name
		System.out.println("main threadname: "+Thread.currentThread().getName());// GIVING MAIN THREAD NAME

		System.out.println("=========================================================");

		// for givind id to threads

		System.out.println("thread2 id: "+t2.getId());
		System.out.println("thread3 id: "+t.getId());
		System.out.println("thread3 id: "+Thread.currentThread().getId()); // main thread id 

		System.out.println("=========================================================");

		// for giving priority to threads
		System.out.println("priority of mainthread =  "+Thread.currentThread().getPriority());
		System.out.println("priority of thread2 : "+t2.getPriority());
		System.out.println("priority of thread3  "+t.getPriority());


		System.out.println("main thread terminated");

	}

}

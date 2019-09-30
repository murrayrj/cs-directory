## Difference between User Threads and Daemon Threads
In Java, there are two types of threads:
1.  Daemon Thread
2.  User Thread

Daemon threads are low priority threads which always run in background and user threads are high priority threads which always run in foreground. User Thread or Non-Daemon are designed to do specific or complex task where as daemon threads are used to perform supporting tasks.

**Difference Between Daemon Threads And User Threads In Java**

1.  **JVM doesn’t wait for daemon thread to finish but it waits for User Thread :**  First and foremost difference between daemon and user threads is that JVM will not wait for daemon thread to finish its task but it will wait for any active user thread.  
    For example, one might have noticed this behavior while running Java program in NetBeans that even if the main thread has finished, the top left down button is still red, showing that Java program is still running. This is due to any user thread spawned from the main thread, but with main thread one don’t see that red dot in NetBeans.
2.  **Thread Priority :**  The User threads are high priority as compare to daemon thread means they won’t get CPU as easily as a user thread can get.
3.  **Creation of Thread :**  User thread is usually created by the application for executing some task concurrently. On the other hand, daemon thread is mostly created by JVM like for some garbage collection job.
4.  **Termination of Thread :** JVM will force daemon thread to terminate if all user threads have finished their execution but The user thread is closed by application or by itself. A user thread can keep running by the JVM running but a daemon thread cannot keep running by the JVM. This is the **most critical difference** between user thread and daemon thread.
5.  **Usage :** The daemons threads are not used for any critical task. Any important task is done by user thread. A daemon thread is generally used for some background tasks which are not critical task.

**The Major Difference between User and Daemon Threads:**

USER THREAD | DAEMON THREAD
--- | ---
JVM wait until user threads to finish their work. It never exit until all user threads finish their work. | The JVM will’t wait for daemon threads to finish their work. The JVM will exit as soon as all user threads finish their work.
JVM will not force to user threads for terminating, so JVM will wait for user threads to terminate themselves. | If all user threads have finished their work JVM will force the daemon threads to terminate
User threads are created by the application. | Mostly Daemon threads created by the JVM.
Mainly user threads are designed to do some specific task. | Daemon threads are design as to support the user threads.
User threads are foreground threads. | Daemon threads are background threads.
User threads are high priority threads. | Daemon threads are low priority threads.
Its life independent. | Its life depends on user threads.

**Example: Check Thread is Daemon or not**

One can make a user thread as daemon thread by using setDaemon(boolean) method. In this example, thread type is being checked (User thread or Daemon thread) by using isDaemon() method. It returns true if it is daemon otherwise it returns false.
```
// Java program check thread is Daemon or not
class MyThread extends Thread {

	@Override
	public void run()
	{
		System.out.println("User Thread or Non-Daemon Thread");
	}
}

class MainThread {
	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		mt.start();

		System.out.println("Main Thread");

		System.out.println("Is " + mt.getName()
							+ " a Daemon Thread: "
							+ mt.isDaemon());

		System.out.println("Is " + Thread.currentThread().getName()
							+ " a Daemon Thread: "
							+ Thread.currentThread().isDaemon());
	}
}
```
**Output:**
```
Main Thread
Is Thread-0 a Daemon Thread: false
Is main a Daemon Thread: false
User Thread or Non-Daemon Thread
```
**Example: Make Non-Daemon Thread as a Daemon Thread:**  
In this example, a non-daemon thread is made a daemon using setDeamon(boolean).
```
// Java program make user thread as a daemon thread
class MyThread extends Thread {

	@Override
	public void run()
	{
		System.out.println("Non-Daemon thread");
	}
}

class MainThread {

	public static void main(String[] args)
	{
		MyThread mt = new MyThread();
		System.out.println("Before using setDaemon() method: ");
		System.out.println("Is " + mt.getName()
							+ " a Daemon Thread: "
							+ mt.isDaemon());

		mt.setDaemon(true);

		System.out.println("After using setDaemon() method: ");
		System.out.println("Is " + mt.getName()
							+ " a Daemon Thread: "
							+ mt.isDaemon());
	}
}
```
**Output:**
```
Before using setDaemon() method: 
Is Thread-0 a Daemon Thread: false
After using setDaemon() method: 
Is Thread-0 a Daemon Thread: true
```


## Difference between Process and Thread
A process is an executing instance of an application. What does that mean? Well, for example, when you double-click the Microsoft Word icon, you start a process that runs Word. 

> A thread is a path of execution  _within_  a process

Also, a process can contain multiple threads. When you start Word, the operating system creates a process and begins executing the primary thread of that process.

It’s important to note that a thread can do anything a process can do. But since a process can consist of multiple threads, a thread could be considered a ‘lightweight’ process. Thus, the essential difference between a thread and a process is the work that each one is used to accomplish. Threads are used for small tasks, whereas processes are used for more ‘heavyweight’ tasks – basically the execution of applications.

Another difference between a thread and a process is that threads within the same process share the same address space, whereas different processes do not. This allows threads to read from and write to the same data structures and variables, and also facilitates communication between threads. Communication between processes – also known as IPC, or inter-process communication – is quite difficult and resource-intensive.

**Process**
Process means any program is in execution. Process control block controls the operation of any process. Process control block contains the information about processes for example: Process priority, process id, process state, CPU, register etc. A process can creates other processes which are known as  **Child Processes**. Process takes more time to terminate and it is isolated means it does not share memory with any other process.

**Thread**
Thread is the segment of a process means a process can have multiple threads and these multiple threads are contained within a process. A thread have 3 states: running, ready, and blocked.

Thread takes less time to terminate as compared to process and like process threads do not isolate.

### Processes vs Threads
1. Threads are easier to create than processes since they 
don't require a separate address space.
						
2. Multithreading requires careful programming since threads 
share data strucures that should only be modified by one thread
at a time.  Unlike threads, processes don't share the same 
address space.
						
3.  Threads are considered lightweight because they use far 
less resources than processes.
						
4.  Processes are independent of each other.  Threads, since they 
share the same address space are interdependent, so caution 
must be taken so that different threads don't step on each other.  
This is really another way of stating #2 above.
						
5.  A process can consist of multiple threads.

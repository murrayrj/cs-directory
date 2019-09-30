## Difference between Thread.start() and Thread.run() in Java
In  [Java’s multi-threading concept](https://www.geeksforgeeks.org/multithreading-in-java/),  **start()**  and  **run()**  are the two most important methods. Below are some of the differences between the  [Thread.start()](https://www.geeksforgeeks.org/start-function-multithreading-java/)  and  [Thread.run()](https://www.geeksforgeeks.org/java-lang-thread-class-java/)  methods:

1.  **New Thread creation:** When a program calls the  _start()_  method, a new thread is created and then the  _run()_  method is executed. But if we directly call the  _run()_  method then no new thread will be created and  _run()_  method will be executed as a normal method call on the current calling thread itself and no multi-threading will take place.  
    Let us understand it with an example:
    ```
    class MyThread extends Thread {
        public void run()
        {
            System.out.println("Current thread name: "
                               + Thread.currentThread().getName());
            System.out.println("run() method called");
        }
    }
    
    class GeeksforGeeks {
        public static void main(String[] args)
        {
            MyThread t = new MyThread();
            t.start();
        }
    }
    ```
    **Output:**
    ```
    Current thread name: Thread-0
    run() method called
    ```
    As we can see in the above example, when we call the  _start()_  method of our thread class instance, a new thread is created with default name  _Thread-0_  and then  _run()_  method is called and everything inside it is executed on the newly created thread.  
    Now, let us try to call  _run()_  method directly instead of  _start()_  method:
    ```
    class MyThread extends Thread {
        public void run()
        {
            System.out.println("Current thread name: "
                               + Thread.currentThread().getName());
            System.out.println("run() method called");
        }
    }
    
    class GeeksforGeeks {
        public static void main(String[] args)
        {
            MyThread t = new MyThread();
            t.run();
        }
    }
    ```
    **Output:**
    ```
    Current thread name: main
    run() method called
    ```
    As we can see in the above example, when we called the  _run()_  method of our MyThread class, no new thread is created and the  _run()_ method is executed on the current thread i.e.  _main_  thread. Hence, no multi-threading took place. The  _run()_  method is called as a normal function call.
    
2.  **Multiple invocation:** In Java’s multi-threading concept, another most important difference between  _start()_  and  _run()_  method is that we can’t call the  _start()_  method twice otherwise it will throw an  _IllegalStateException_  whereas  _run()_  method can be called multiple times as it is just a normal method calling.  
    Let us understand it with an example:
    ```
    class MyThread extends Thread {
        public void run()
        {
            System.out.println("Current thread name: "
                                + Thread.currentThread().getName());

            System.out.println("run() method called");
        }
    }
    
    class GeeksforGeeks {
        public static void main(String[] args)
        {
            MyThread t = new MyThread();
            t.start();
            t.start();
        }
    }
    ```
    **Output**:
    ```
    Current thread name: Thread-0
    run() method called
    Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.start(Thread.java:708)
        at GeeksforGeeks.main(File.java:11)
    ```
    As we can see in the above example, calling  _start()_  method again raises  _java.lang.IllegalThreadStateException_.  
    Now, let us try to call  _run()_  method twice:
    ```
    class MyThread extends Thread {
        public void run()
        {
            System.out.println(``"Current thread name: "
                               + Thread.currentThread().getName());
            System.out.println("run() method called");
        }
    }
    
    class GeeksforGeeks {
        public static void main(String[] args)
        {
            MyThread t = new MyThread();
            t.run();
            t.run();
        }
    }
    ```
    **Output:**
    ```
    Current thread name: main
    run() method called
    Current thread name: main
    run() method called
    ```
    As we can see in the above example, calling  _run()_  method twice doesn’t raise any exception and it is executed twice as expected but on the  _main_ thread itself.
    
    **Summary**
    
START() | RUN()
--- | ---
Creates a new thread and the run() method is executed on the newly created thread.| No new thread is created and the run() method is executed on the calling thread itself.
Can’t be invoked more than one time otherwise throws  _java.lang.IllegalStateException_ | Multiple invocation is possible
Defined in  _java.lang.Thread_  class. | Defined in  _java.lang.Runnable_  interface and must be overriden in the implementing class.
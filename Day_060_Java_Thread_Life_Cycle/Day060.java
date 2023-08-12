/*
1. New -> Instance of thread created which is not yet started by invoking start().
2. Runnable -> After invocation of start() and before it is selected to be run by the scheduler.
3. Running -> After thread scheduler has selected it .
4. Non-Runnable -> Thread alive, not eligible to run.
5. Terminated -> run() method has exited.
 */

/*
Here's a typical sequence of how a thread progresses through these states:
1. New: A new thread is created using the new Thread() constructor or by implementing the Runnable interface and passing
        it to a Thread instance.
2. Runnable: The thread is started by calling the start() method on the Thread instance. This moves the thread to the runnable state.
3. Running: The JVM's thread scheduler selects a thread from the runnable pool and allows it to run on a CPU core. The
            thread is executing its run method.
4. Blocked or Waiting: The thread might transition to a blocked or waiting state due to synchronization or waiting for a
                       condition. It remains in this state until the condition is met or the lock is available.
5. Runnable: Once the blocking or waiting condition is satisfied, the thread moves back to the runnable state.
6. Terminated: The thread completes its execution either by reaching the end of its run method or due to an unhandled exception.
               In either case, the thread enters the terminated state.
 */
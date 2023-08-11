// Multiprocessing and multithreading both are used to achieve multitasking
// Multiprocessing : running multiple processes on the os like running vscode, chrome, intellij idea on a windows laptop.
// Multithreading : running multiple threads (multitasking within processes) like we can do multitasking on chrome which itself is a process.

/*
In a nutshell :
* Threads use shared memory area.
* Threads -> faster context switching.
* A thread is lightweight whereas process is heavyweight.
* For example : a word processor can have one thread running in foreground as an editor and another in the background auto
                saving the document
 */
/*
Without threading :
main() -> function1() -> function2() -> END
function2 cannot run unless function1 is completed in this case.
 */
/*
With Threading :
With the help of threading all the functions are run concurrently and the execution will become very fast.
 */

/*
Creating a Thread :
There are two ways to create a thread in Java :
1. By extending thread class
2. By implementing runnable interface
 */
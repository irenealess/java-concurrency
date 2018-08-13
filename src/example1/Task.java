package example1;

/*
A simple way to provide behaviour to a thread.
*/

public class Task implements Runnable {

    /*
    This task only prints the thread's name what is executing it.
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

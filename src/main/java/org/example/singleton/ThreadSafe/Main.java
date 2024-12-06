package org.example.singleton.ThreadSafe;

public class Main {
    public static void main(String args[]){
        Thread t1 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance();
            singleton1.display();
        });

        Thread t2 = new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance();
            singleton2.display();
        });

        //start both threads (does not block the calling thread, starts execution in bg)
        t1.start();
        t2.start();

        //wait for both threads to finish (blocks the calling thread)
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

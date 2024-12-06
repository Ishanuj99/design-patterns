package org.example.singleton.ThreadSafe;

//Double checked locking
public class Singleton {
    private static volatile Singleton instance; //volatile ensures changes to instance are visible to all threads
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null){ // first instance check without locking, return the instance if already exists no need for locking
            synchronized (Singleton.class){ //specifies the object on which lock is applied
                if(instance == null){ //second check if instance is created while thread is waiting for lock
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void display(){
        System.out.println("Instance hashcode: "+ instance.hashCode());
    }
}

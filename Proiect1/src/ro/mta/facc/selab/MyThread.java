package ro.mta.facc.selab;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Hellof from "+Thread.currentThread().getName());
    }
}

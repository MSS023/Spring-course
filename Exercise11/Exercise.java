// TODO: Define PrinterTask class that implements Runnable

class PrinterTask implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 1; i < 6; i += 1) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

public class Exercise {

    public static void main(String[] args) {
        // TODO: Create a single PrinterTask object
        Runnable obj = new PrinterTask();

        // TODO: Create two threads using the same task
        // Name them "Worker-1" and "Worker-2"
        Thread obj1 = new Thread(obj, "Worker-1");
        Thread obj2 = new Thread(obj, "Worker-2");

        // TODO: Start both threads
        obj1.start();
        obj2.start();
        
        // TODO: Use join() to wait for both threads to finish
        try {
            obj1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            obj2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

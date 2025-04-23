

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting...");
        try {
            Thread.sleep(3000);  
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        System.out.println(Thread.currentThread().getName() + " is finished.");
    }
}

public class Two {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("Main thread ends, but child threads may still be running!");
    }
}

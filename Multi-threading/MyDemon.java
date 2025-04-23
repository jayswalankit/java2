public class  MyDemon extends Thread {
    public void run(){
        while(true){
        System.out.println("Demon running");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        
        }
        }
    }
    public static void main(String[] args) {
        MyDemon obj=new MyDemon();
        obj.setDaemon(true);
        obj.start();

        // System.out.println("Main thread ends");
    }
}

  
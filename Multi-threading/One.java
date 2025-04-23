
class myThread extends Thread{
    public void run(){
        System.out.println("running thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
          
        }
        System.out.println("thread is finished"+Thread.currentThread().getName());
    }
}
public class One {
    public static void main(String[] args) {
        myThread obj=new myThread();
        myThread obj2=new myThread();
        
       
        obj.start();
        obj2.start();
        try {
            obj.join(5000);
            obj2.join(7000);
        } catch (Exception e) { 
          
        }
        System.out.println("done");
    }
}


// whats whappening is pehla messege ke baad jitna time de rhe hai utna wait ke baad dusra messege de rha hai
// sleep ensure time duration and join ensure one task complete before another

// class myThread extends Thread{
//     public void run(){
//         System.out.println("running thread "+Thread.currentThread().getName());
//         try {
//             Thread.sleep(10000);
//         } catch (Exception e) {
          
//         }
//         System.out.println("thread is finished"+Thread.currentThread().getName());
//     }
// }
// public class One {
//     public static void main(String[] args) {
//         myThread obj=new myThread();
//         myThread obj2=new myThread();
        
       
//         obj.start();
//         obj2.start();
//         try {
//             obj.join(3000);
//             obj2.join(5000);
//         } catch (Exception e) {
          
//         }
//         System.out.println("done");
//     }
// }


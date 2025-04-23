
// public class three extends Thread{
//     public static void main(String[] args) {
//         System.out.println("program started");
//         int a=6;
//         int b=6;
//         int c=a+b;
//         Thread obj=new Thread();
//         String objname=obj.getName();
//         System.out.println(obj.getName());
//         System.out.println("thread name is: "+objname);
//         System.out.println(c);
//         System.out.println("end");
//     }
// }




public class three implements Runnable {
 public void run(){
    try {
        
    } catch (Exception e) {
       
    }
 }

}
    public static void main(String[] args) {
        System.out.println("program started");
        int a=6;
        int b=6;
        int c=a+b;
        Thread obj=new Thread();
        String objname=obj.getName();
        // System.out.println(obj.getName());
        System.out.println("thread name is: "+objname);
        System.out.println(c);
        System.out.println("end");
    }


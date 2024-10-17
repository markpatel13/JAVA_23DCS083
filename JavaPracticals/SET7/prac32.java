class Myclass extends Thread{
    public void run(){
        System.out.println("Hello world");
    }
}
class Myclass1 implements Runnable{
    public void run(){
        System.out.println("Hello world 2");
    }
}
public class prac32 {
    public static void main(String[] args) {
        Myclass thread = new Myclass();
        thread.start();
        Myclass1 runnable = new Myclass1();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        thread1.run();
        System.out.println("23DCS083_MARK");
        
    }
}

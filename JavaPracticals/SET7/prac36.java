// class Myclass extends Thread{
//     public Myclass(String a){
//        super(a);
//     }
//     public void run(){
//         System.out.println("Inside Run Method "+getName());

//     }
// }
// public class prac36 {
//      public static void main(String[] args) {
//         Myclass t1 = new Myclass("marko");
//         Myclass t2 = new Myclass("patel");
//         Myclass t3 = new Myclass("hello");

//         //System.out.println();

//         System.out.println("t1 current priority :"+t1.getPriority());
//         System.out.println("t2 current priority :"+t2.getPriority());
//         System.out.println("t3 current priority :"+t3.getPriority());

//         t1.setPriority(7);
//         t2.setPriority(3);
//         t3.setPriority(4);

//         // System.out.println("after operation t1 priority :"+t1.getPriority());
//         // System.out.println("after operation t2 priority :"+t2.getPriority());
//         // System.out.println("after operation t3 priority :"+t3.getPriority());

//         // System.out.println("Inside Current Thread:"+Thread.currentThread().getName());
//         // System.out.println("after operation Main Thread priority :"+Thread.currentThread().getPriority());
//         // Thread.currentThread().setPriority(10);
//         // System.out.println("after operation Main Thread priority :"+Thread.currentThread().getPriority());

//         t1.start();
//         t2.start();
//         t3.start();

//         try {
//             t2.join();  // Ensures t2 finishes before others
//             t3.join();  // Ensures t3 finishes before t1
//             t1.join();  // Ensures t1 finishes last
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

// }

// }
class T extends Thread {
    public T(String s) {
        super(s);
    }

    public void run() {
        System.out.println("This is run method :" + getName());
    }

}

public class prac36 {
    public static void main(String[] args) {
        T FIRST = new T("FIRST");
        T SECOND = new T("SECOND");
        T THIRD = new T("THIRD");

        System.out.println("defualt priority:");
        System.out.println("FIRST:" + FIRST.getPriority());
        System.out.println("SECOND:" + SECOND.getPriority());
        System.out.println("THIRD:" + THIRD.getPriority());

        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);

        System.out.println("updated priority:");
        System.out.println("FIRST:" + FIRST.getPriority());
        System.out.println("SECOND:" + SECOND.getPriority());
        System.out.println("THIRD:" + THIRD.getPriority());

        THIRD.start();
        SECOND.start();
        FIRST.start();

        System.out.println("23DCS083_MARK");

    }
}
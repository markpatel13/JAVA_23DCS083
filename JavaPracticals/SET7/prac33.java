// class SumThread extends Thread {
//     private int start, end;
//     private long sum;  // long is used to store large sums

//     public SumThread(int start, int end) {
//         this.start = start;
//         this.end = end;
//         this.sum = 0;
//     }

//     public long getSum() {
//         return sum;
//     }

//     @Override
//     public void run() {
//         for (int i = start; i <= end; i++) {
//             sum += i;
//         }
//     }
// }

// public class prac33 {
//     public static void main(String[] args) {
//         // Command-line arguments: first is N, second is number of threads
//         int N = Integer.parseInt(args[0]);
//         int numThreads = Integer.parseInt(args[1]);

//         if (numThreads > N) {
//             numThreads = N;
//         }

//         SumThread[] threads = new SumThread[numThreads];
//         int range = N / numThreads;
//         int remainder = N % numThreads;

//         int start = 1;

//         // Creating threads
//         for (int i = 0; i < numThreads; i++) {
//             int end = start + range - 1;
//             if (i == numThreads - 1) {
//                 end += remainder; // Last thread takes the remainder
//             }
//             threads[i] = new SumThread(start, end);
//             start = end + 1;
//         }

//         // Start each thread
//         for (SumThread thread : threads) {
//             thread.start();
//         }

//         // Wait for all threads to finish
//         long totalSum = 0;
//         try {
//             for (SumThread thread : threads) {
//                 thread.join();  // Ensures the main thread waits for each thread to finish
//                 totalSum += thread.getSum();  // Collect each thread's sum
//             }
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         // Output the final sum
//         System.out.println("The sum of numbers from 1 to " + N + " is: " + totalSum);
//         System.out.println("23DCS083_MARK");
//     }
// }
import java.util.*;
class SumTask implements Runnable {
    private int start;
    private int end;
    private int[] result;
    private int index;

    public SumTask(int start, int end, int[] result, int index) {
        this.start = start;
        this.end = end;
        this.result = result;
        this.index = index;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        result[index] = sum;
    }
}

public class prac33 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two arguments: N and the number of threads.");
            return;
        }

        int N = Integer.parseInt(args[0]);
        int numThreads = Integer.parseInt(args[1]);

        int[] result = new int[numThreads];

        int range = N / numThreads;
        int remainder = N % numThreads;

        Thread[] threads = new Thread[numThreads];

        int start = 1;
        for (int i = 0; i < numThreads; i++) {
            int end = start + range - 1;

            if (i == numThreads - 1) {
                end += remainder;
            }

            threads[i] = new Thread(new SumTask(start, end, result, i));
            threads[i].start();

            start = end + 1;
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        int finalSum = 0;
        for (int sum : result) {
            finalSum += sum;
        }

        System.out.println("The sum of the first " + N + " numbers is: " + finalSum);

        System.out.println(" ");
        System.out.println("23DCS083_MARK");
    }
}
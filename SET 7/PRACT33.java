import java.util.Scanner;

public class PRACT33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();
        int N = 10;
        long[] partialSums = new long[numThreads];
        Thread[] threads = new Thread[numThreads];
        int numbersPerThread = N / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int startIndex = i * numbersPerThread + 1;
            int endIndex = (i + 1) * numbersPerThread;
            if (i == numThreads - 1) {
                endIndex = N;
            }

            threads[i] = new Thread(new SumTask(startIndex, endIndex, partialSums, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            joinThread(thread);
        }

        long totalSum = 0;
        for (long sum : partialSums) {
            totalSum += sum;
        }

        System.out.println("Sum of numbers from 1 to 10: " + totalSum);
    }

    static void joinThread(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
        }
    }

    static class SumTask implements Runnable {

        final int startIndex;
        final int endIndex;
        final long[] partialSums;
        final int threadIndex;

        public SumTask(int startIndex, int endIndex, long[] partialSums, int threadIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.partialSums = partialSums;
            this.threadIndex = threadIndex;
        }

        @Override
        public void run() {
            partialSums[threadIndex] = calculateSum(startIndex, endIndex);
        }

        long calculateSum(int startIndex, int endIndex) {
            long sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += i;
            }
            return sum;
        }
    }
}

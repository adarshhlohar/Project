class AverageThread extends Thread {
    private int[] arr;

    public AverageThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i + 1;
        }
        double average = (double) sum / 10;
        System.out.println("Average of the first 10 numbers: " + average);

        synchronized (this) {
            this.notify();
        }
    }
}


class SquareThread extends Thread {
    private int[] arr;

    public SquareThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int num : arr) {
            int square = num * num;
            System.out.println("Square of " + num + " is " + square);
        }
    }
}

public class ThreadAssignment1 {
    public static void main(String[] args) {
        int[] arr = { 1, 20, 50, 15, 30 };

        AverageThread avgThread = new AverageThread(arr);
        SquareThread squareThread = new SquareThread(arr);

        avgThread.start();

        synchronized (avgThread) {
            try {
                avgThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        squareThread.start();
    }
}

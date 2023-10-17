class Printer {
    private boolean isOddTurn = true;
    int number = 1;

    public synchronized void printOdd() {
        while (!isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Odd: " + number);
        number += 2;
        isOddTurn = false;
        notify();
    }

    public synchronized void printEven() {
        while (isOddTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Even: " + (number - 1));
        isOddTurn = true;
        notify();
    }
}

class OddPrinter implements Runnable {
    private Printer printer;

    public OddPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        while (printer.number <= 100) {
            printer.printOdd();
        }
    }
}

class EvenPrinter implements Runnable {
    private Printer printer;

    public EvenPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        while (printer.number <= 100) {
            printer.printEven();
        }
    }
}

public class ThreadAssignment2 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread oddThread = new Thread(new OddPrinter(printer));
        Thread evenThread = new Thread(new EvenPrinter(printer));

        oddThread.start();
        evenThread.start();
    }
}

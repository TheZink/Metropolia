class NumberPrinting extends Thread {
    private int delay;
    private int number;

    public NumberPrinting(int delay, int number) {
        this.number = number;
        this.delay = delay;
    }

    public void run() {
    
        try {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                    Thread.sleep(delay);
                } else {
                    System.out.println(i + " is odd");
                    Thread.sleep(delay);
                }
            }
        } catch (InterruptedException e) {
            return;
        }
    }
}

public class NumberPrintingMain {
    public static void main(String[] args) {
        new NumberPrinting(1000,30).start();;

    }
}
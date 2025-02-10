class NumberPrinting extends Thread {
    private int start;
    private int end;
    private String type;

    public NumberPrinting(int start, int end, String type) {
        this.start = start;
        this.end = end;
        this.type = type;
    }

    public void run() {
        try {

            // Tarkistetaan, että onko luku parillinen
            if (type.equals("even")) {
                for (int i = start; i <= end; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is even");
                    }
                }
            }
            
            // Tarkistetaan, että onko luku pariton
            if (type.equals("odd")) {
                for (int i = start; i <= end; i++) {
                    if (i % 2 != 0) {                       
                        System.out.println(i + " is odd");
                    }
                Thread.sleep(100);
                }

            System.out.println("Tuloste on valmis");
            }
        } catch (Exception e) {
            return;
        }        
    }

}

public class NumberPrintingMain {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new NumberPrinting(1,100,"even"));
        Thread oddThread = new Thread(new NumberPrinting(1, 100, "odd"));

        try {
            oddThread.start();                  // Käynnistetään oddThread
            evenThread.start();                 // Käynnistetään evenThread
            evenThread.join();                  // Odotetaan, että parilliset on tulostettu
        } catch (InterruptedException e) {
            return;
        }

    }
}
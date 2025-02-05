import java.io.*;

public class FibonacciCSV {
    private static String FILENAME = "fibonacci.csv";
    public static void main(String[] args) {
        
        int f = 60;
        long[] fibonacciNubmers = new long[f];

        // Lasketaan fibonaccin luvut
        fibonacciNubmers[0] = 0;
        fibonacciNubmers[1] = 1;

        for (int i = 2; i < f; i++){
            fibonacciNubmers[i] = fibonacciNubmers[i - 1] + fibonacciNubmers[i -2];
        }
               
        // Kirjoitetaan CSV-tiedostoon
        try (FileWriter writer = new FileWriter(FILENAME)){
            
            // Iteroidaan fibonacciNumbers ja lisätään CSV-tiedostoon
            for (int i = 0; i < f; i++) {
                writer.append("" + fibonacciNubmers[i] + "\n");
            }
        } catch (Exception e) {
            System.err.println(e);
        }       
    }
}

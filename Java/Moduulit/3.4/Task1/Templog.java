import java.io.*;
import java.net.*;

public class Templog {

    public static void main(String[] args) {

        URL myUrl;
        double averageTemp = 0;
        int tempCounter = 0;

        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        
            InputStream istream = myUrl.openStream();                           // Avataan yhteys tiedostoon
            InputStreamReader iStreamReader = new InputStreamReader(istream);   // Hypätään Character-streams
            BufferedReader reader = new BufferedReader(iStreamReader);          // Bufferoitu luku
            String line;
            
            while ((line = reader.readLine()) != null) {                        // Luetaan dataa
                String[] columns = line.split(";");

                try {                                                           // Varmistetaan ohjelman toimivuus, jos sarakkeessa on virheellisiä merkintöjä
                                                                                
                    if (columns.length > 1) {                                   
                    averageTemp += Double.parseDouble(columns[1].replace(",", ".")); // Muutetaan sarakkeen data oikean muotoiseksi. x,x -> x.x
                    tempCounter++;
                    System.out.println();
                    }

                } catch (NumberFormatException e) { 
                    System.out.println("Virheellinen data: " + columns[1]);     // Tulostetaan, jos sarakkeessa on virheellinen data
                }
            }

            reader.close();

        } catch (MalformedURLException e ) {  
            System.err.println(e);                                              // Tulostetaan, jos virheellinen URL tai siihen ei saada yhteyttä
        } catch (IOException e) {  
            System.err.println(e);                                              // Tulostetaan, jos tiedosto ei ole tai on viallinen
        }

        double average = averageTemp/tempCounter;

        System.out.printf("Keskilämpötila oli %.1f celsiuc-astetta",average);
  
    }

}

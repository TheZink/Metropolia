import java.util.ArrayList;

public class AgeDistribution {
    public static void main(String[] args) {
        final int iteration_times = 1000;
        final int maxage = 22;

        ArrayList<ArrayList<Integer>> ageCounter = new ArrayList();

        int agedistribution[][] = {
            {20,18},    // 20%
            {50,19},    // 30%
            {75,20},    // 25%
            {90,21},    // 15%
            {100,maxage}    // 10%
        };

        // Alustetaan kaksiulotteista ArrayList. Luodaan lista, jossa on ikä ja esiintymiskerta (Esimerkiksi {18,0})
        for (int i = 18; i <= maxage; i++) {
            ArrayList<Integer> entry = new ArrayList<>();
            entry.add(i);
            entry.add(0);
            ageCounter.add(entry);
        }

        
          // Simuloidaan ikien esiintymistä
        for (int j = 1; j <= iteration_times; j++) {
            int random = (int)(Math.random()*100)+1; // Luodaan satunnainen luku väliltä 1-100
          
            // Etsitään oikea alkio agedistribution-listasta
            for (int k = 0; k < agedistribution.length; k++) {
                if (agedistribution[k][0] > random) {

                    // Etsitään ikä ArrayList:sta ja korotetaan esiintymiskerta
                    for (ArrayList<Integer> entry: ageCounter) {
                        if (entry.get(0) == agedistribution[k][1]) {
                            entry.set(1, entry.get(1) + 1);
                        }
                    }
                break;
                }
            }
        }

        // Tulostetaan tiedot ikäjakaumasta. Kaava on "prosentti = esiintymiskerrat / simulaatioiden lukumäärä * 100"
        for (ArrayList<Integer> print: ageCounter) {
            int age = print.get(0);
            int count = print.get(1);
            double percentage = (double) count/iteration_times*100;
            System.out.printf("Ikä: %d, esiintymiskerta: %d, prosentteina: %.1f\n",age,count,percentage);
        }
    }
}
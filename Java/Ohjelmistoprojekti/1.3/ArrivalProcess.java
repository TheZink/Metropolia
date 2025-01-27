import java.util.ArrayList;

public class ArrivalProcess {
    public static void main(String[] args) {

        Clock clock = Clock.getInstance();
        ArrayList<Long> arrivallist = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            long currentTime = clock.getTime();
            arrivallist.add(currentTime);
        }

        for (int j = 0; j < arrivallist.size(); j++) {
            System.out.println(arrivallist.get(j));
        }


    }
}

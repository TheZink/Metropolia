public class Clock {
    private static Clock instance;
    private Long time;

    // Luodaan Singletonin mukaisen kontruktorin. Tällä hetkellä siinä ei ole mitään
    private Clock() {
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance; 
    }

    // Palautetaan sen hetkisen ajan, kun tätä metodia kutsutaan
    public long getTime() {
        time = System.currentTimeMillis() / 1000;
        return time;
    }
}

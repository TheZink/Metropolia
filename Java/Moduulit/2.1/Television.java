public class Television {

    private int channel;
    private boolean status;

    // Konstruktori
    public Television() {
        channel = 1;
        status = false;
    }

    // Metodi vaihtaa television tilan
    public void pressOnOff() {
        if (!status) {
            status = true;
        } else {
            status = false;
        }
    }

    // Palautetaan television tila
    boolean isOn() {
        return status;
    }

    // Korotetaan kanavan numeroa
    void setChannel(int change) {
        if (channel < 10) {
            channel = change;
        } else {
            channel = 1;
        }
    }

    // Palautetaan kanavan numero
    int getChannel() {
        return channel;
    }
}
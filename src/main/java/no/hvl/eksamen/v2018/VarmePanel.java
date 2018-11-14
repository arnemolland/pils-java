package no.hvl.eksamen.v2018;

class VarmePanel implements IKontrol {
    private boolean status;
    private IAktuator aktuator;

    public VarmePanel(IAktuator aktuator) {
        this.aktuator = aktuator;
        status = false;
    }

    public void on() {
        if (!status)
            aktuator.aktiver();
    }

    public void off() {
        if (status)
            aktuator.deaktiver();
    }

    public boolean getStatus() {
        return status;
    }

    public static void smartPanel(ISensor sensor, VarmePanel panel, double grense) {
        while (true) {
            if (sensor.leseav() < grense)
                panel.on();

            vent(60);
        }
    }

    static void vent(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }
}
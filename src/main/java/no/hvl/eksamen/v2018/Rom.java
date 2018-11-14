package no.hvl.eksamen.v2018;

class Rom {
    private char bygg;
    private int nummer;

    public Rom(char bygg, int nummer) {
        this.bygg = bygg;
        this.nummer = nummer;
    }

    public char getBygg() {
        return bygg;
    }

    public void setBygg(char bygg) {
        this.bygg = bygg;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String toString() {
        return String.format("[ %c%d ]", bygg, nummer);
    }
}
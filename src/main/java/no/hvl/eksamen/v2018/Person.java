package no.hvl.eksamen.v2018;

class Person {
    private String navn;

    public String getNavn() {
        return navn;
    }
    public Person(String navn) {
        this.navn = navn;
    }

    public String toString() {
        return navn;
    }
}
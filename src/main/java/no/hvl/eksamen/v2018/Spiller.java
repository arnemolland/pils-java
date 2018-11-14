package no.hvl.eksamen.v2018;

class Spiller {
    private String dato;
    private String navn;
    private int antallFerdige;
    private int[] resTab;

    public Spiller(String navn, String dato, int antall) {
        this.navn = navn;
        this.dato = dato;
        resTab = new int[antall];
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getAntallFerdige() {
        return antallFerdige;
    }

    public void leggTilRes(int r) {
        for(int i = 0; i < resTab.length; i++) {
            if(resTab[i] == 0) {
                resTab[i] = r;
                antallFerdige += 1;
                return;
            }

        }
    }

    public int sumSlag() {
        int sum = 0;

        for(int resultat : resTab)
            sum += resultat;

        return sum;
    }

    public boolean erFerdig() {
        for(int i : resTab) {
            if(i == 0)
                return false;
        }

        return true;
    }

    public String toString() {
        return String.format("%s, %s, Sum slag: %d etter %d av %d hull\n", navn, dato, sumSlag(), antallFerdige, resTab.length);
    }

    public int antallOverPar(int[] parTab) {
        int antall= 0;

        for(int i = 0; i < parTab.length; i++) {
            if(parTab[i] > resTab[i])
                antall += 1;
        }

        return antall;
    }

    void visScore(int[] parTab) {
        System.out.print(toString());

        for (int i = 0; i < parTab.length; i++) {
            String resNavn = "";
            int diff = parTab[i] - resTab[i];
            
            if (diff == 1) {
                resNavn = "Birdie";
            }
            
            if (diff == 2) {
                resNavn = "Eagle";
            }

            if (diff == 3) {
                resNavn = "Albatross";
            }

            if (diff == 4) {
                resNavn = "Kondor";
            }

            if(resTab[i] == 1) {
                resNavn = "Hole in one";
            }

            String resultat = String.format("Hull %d: %d (%d) - %s", i, resTab[i], parTab[i], resNavn);
            System.out.println(resultat);
        }
    }
}
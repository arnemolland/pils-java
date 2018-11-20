package no.hvl.eksamen.v2018;

class Reservasjon {
    private Rom rom;
    private Person person;

    public Reservasjon(Rom rom, Person person) {
        this.rom = rom;
        this.person = person;
    }

    public String toString() {
        return(rom.toString() + person.toString());
    }

    class UkesReservasjon {
        boolean[] dager;

        UkesReservasjon(Rom rom, Person person) {
            super();
            dager = new boolean[7];
        }

        public void setDager(boolean[] dager) {
            this.dager = dager;
        }

        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append(super.toString());
            for(int i = 0; i < dager.length; i++) {
                if(dager[i])
                    builder.append(tilDag(i)+"\n");
            }

            return builder.toString();
        }

        public UkesReservasjon nyReservasjon(String navn, char bygg, int nummer, boolean[] dager) {
            UkesReservasjon reservasjon = new UkesReservasjon(new Rom(bygg, nummer), new Person(navn));
            reservasjon.setDager(dager);

            return reservasjon;
        }

        public String tilDag(int d) {
            switch(d) {
                case(0): return "Mandag";
                case(1): return "Tirsdag";
                case(2): return "Onsdag";
                case(3): return "Torsdag";
                case(4): return "Fredag";
                case(5): return "Lørdag";
                case(6): return "Søndag";
                default: return "";
            }
        }
    }
}
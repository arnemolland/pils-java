package no.hvl.eksamen.v2018;

class FireRad {
    public char[][] brett =
    { { 'I', 'I', 'I', 'I', 'I', 'I'},
        { 'I', 'I', 'I', 'I', 'I', 'I'},
        { 'B', 'I', 'G', 'G', 'G', 'I'},
        { 'B', 'B', 'G', 'G', 'B', 'B'} };

        public boolean harTegn(int r, int k, char c) {
            return brett[r][k] == c;
        }

        public boolean ingenBrikke(int r, int k) {
            return brett[r][k] == 'I';
        }

        public void visTilstand() {
            for(char[] r : brett) {
                for(char c : r) {
                    if(c == 'I')
                        System.out.print(" ");
                    else
                        System.out.print(c);
                }
                System.out.println();
            }
        }

        public int hvilkenRekke(int k) {
            for(int i = 0; i < brett.length; i++) {
                if(brett[i][k] == 'I' && brett[i+1][k] != 'I') {
                    return i;
                }
            }
            return -1;
        }

        public void plasserBrikke(int k, char c) {
            brett[hvilkenRekke(k)][k] = c;
        }

        public boolean sjekkVannrett(int r, int k, char c) {
            for(int i = 0; i < 4; i++) {
                if(brett[r][k+i] != c)
                    return false;
            }
            return true;
        }

        public boolean fireVannrett(int r, char c) {
            for(int i = 0; i < brett[r].length; i++){
                if(sjekkVannrett(r, i , c))
                    return true;
            }
            return false;
        }

}
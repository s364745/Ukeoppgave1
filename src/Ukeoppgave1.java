public class Ukeoppgave1 {
    public static void main(String[] args) {

        int[] a = {3, 2};
        int minindex = min(a);

        //System.out.println(minindex);
        //1.1.3.5
        //System.out.println(minmax(a));

        //1.1.3.6
        System.out.println(fak(4));
    }
    // Metode for å finne indexen til det minste tallet
    static int min(int[] a ){
        // Initialiserer med første element
        int min_value = a[0];
        int min_index = 0;
        //Looper over alle resterende elementer og sjekker om vi finner et mindre tall
        for(int i=1; i<a.length; i++){
            int value = a[i];
            int index = i;
        // Sjekker om verdien er mindre enn det vi hadde sett tidligere
            if (value < min_value){
                min_value = value;
                min_index = index;
            }
        }
        // Returnerer indexen på det minste tallet
        return min_index;
    }
    // Oppgave 1.1.3.5
    public static int[] minmax(int[] a){
        int minste_verdi = a[0];
        int minste_verdi_index = 0;

        int storst_verdi = a[0];
        int storst_verdi_index = 0;

        for(int i = 1; i < a.length; i++){
            int verdi = a[i];
            int index = i;
            if(verdi<minste_verdi){
                minste_verdi = verdi;
                minste_verdi_index = index;
            }
            if(verdi>storst_verdi){
                storst_verdi = verdi;
                storst_verdi_index = i;
            }
        }
        return new int[]{minste_verdi_index,storst_verdi_index};
    }

    // 1.1.3.6
    public static long fak(int n){
        if (n < 0){
            throw new IllegalArgumentException("n < o");
        }
        long fak = 1;
        for(int i = 2; i <= n; i++){
            fak *= i;
        }
        return fak;
    }

    /*
    
     */
}
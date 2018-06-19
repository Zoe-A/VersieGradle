public class BankLoop {
    public static void main(String[] args) {
        double kapitaal = 100000;
        double termijn = 10;
        double rente = 1.035;
        double resultaat = kapitaal;


        for ( int teller = 1; teller <= termijn ; teller++ ) {
            System.out.println("Uw kapitaal na " + teller + " jaar = " + (kapitaal = kapitaal * rente));
        }


    }
}


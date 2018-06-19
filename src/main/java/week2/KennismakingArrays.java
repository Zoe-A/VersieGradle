package week2;

public class KennismakingArrays {
    public static void main(String[] args) {

        int[] i = {1, 2, 6, 45, 65};

        System.out.println(i.length + " Dit is de lengte van de Array");

        int n = i[2];           // n = element op indexpositie 2
        System.out.println(n + " Dit is de waard evan het element op index 2");

        System.out.println();

        for (int teller = 0; teller < i.length; teller++){
            System.out.println(i[teller]);

        }

        System.out.println();


        String[] x = {"Jimi", "Janis","Jim", "Amy", "Kurt"};

        for (int teller = 0; teller < x.length; teller++){ // indexed for loop, meer opties
            System.out.println(x[teller]);

        }

        System.out.println();

        for (String naam : x){         // for each loop, simpeler
            System.out.println(naam); // String naam is tijdelijke lokale variabele
        }

        System.out.println();

        for (int getal : i){
            System.out.println(getal);
        }

        System.out.println();

        int[] getallen = new int[3]; // maakt array met 1000 plaatsen met waarde 0

        for (int y : getallen){
            System.out.println(y);
        }

        System.out.println();

        int [][] getallen2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int zeven = getallen2 [2][0];

        System.out.println(zeven);


    }
}

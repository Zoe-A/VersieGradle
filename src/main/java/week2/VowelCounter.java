package week2;

public class VowelCounter {
    public static void main(String[] args) {


        String tekst = "Hallo ik ben zoe";

        char[] charArray = tekst.toCharArray();

        int l = charArray.length;

        char[] klinker = {'a', 'e', 'i', 'o', 'u'};

        int aantA = 0;
        int aantE = 0;
        int aantI = 0;
        int aantO = 0;
        int aantU = 0;


        for (int teller = 0 ; teller < l ; teller++){

            char n = charArray [teller];

            if (n == klinker[0]){
               aantA++;
            }
            if (n == klinker[1]){
                aantE++;
            }
            if (n == klinker[2]){
                aantI++;
            }
            if (n == klinker[3]){
                aantO++;
            }
            if (n == klinker[4]){
                aantU++;
            }


        }

        System.out.println(aantA);
        System.out.println(aantE);
        System.out.println(aantI);
        System.out.println(aantO);
        System.out.println(aantU);

    }
}

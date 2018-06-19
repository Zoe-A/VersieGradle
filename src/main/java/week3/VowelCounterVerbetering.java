package week3;

import java.util.Scanner;

public class VowelCounterVerbetering { // 'Hoofd'code
    public static void main(String[] args) {
        System.out.println("Geef een tekst op aub. ");
                Scanner s = new Scanner(System.in);
        String input = s.nextLine().toLowerCase();

        char[] data = converteerNaarArray(input);

        int[] letters = new int [26]; // ASCI alfabet

        for (char datum : data){
            int index = lettersAlsIndex(datum);
            letters[index]++;
        }
        System.out.println("A :" + letters[lettersAlsIndex('a')]);
        System.out.println("E :" + letters[lettersAlsIndex('e')]);
        System.out.println("I :" + letters[lettersAlsIndex('i')]);
        System.out.println("O :" + letters[lettersAlsIndex('o')]);
        System.out.println("U :" + letters[lettersAlsIndex('u')]);


    }
    //Onderstaand fabriekje voor een string naar chars over te zetten.

    public static char[] converteerNaarArray(String in){
        char[] out = new char[in.length()];

        for (int i = 0; i < in.length(); i++){
            char ch = in.charAt(i);
            out[i] = ch;

        }

        return out;
    }
    public static int lettersAlsIndex(char ch){
        return ch - 'a';
    }

}

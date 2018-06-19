package week4.vrijdag;

import java.util.Scanner;

public class Seasonbewerking {
    public static void main(String[] args) {
        Season[] seasons = Season.values();

        for (Season season : seasons){
            System.out.println(season);
        }

        System.out.println("-----------");

        try {

            Scanner s = new Scanner(System.in);
            String in = s.next();

            Season season = Season.valueOf(in);
        } catch (IllegalArgumentException e) {
            System.out.println("FOUTE INVOER");
        }
        // Scanner niet geclosed

        System.out.println("-----------");

        try (Scanner sc = new Scanner(System.in)){
            String in = sc.next();
            Season season = Season.valueOf(in);

        }catch (IllegalArgumentException i) {
            System.out.println("FOUT FOUT FOUT");
        }
        // try with resources, Scanner word automatisch geclosed.

    }


    /*public static Season valueOf(String in) {
        Season season = null
        switch (in) {
        case "WINTER":
        season = Season.WINTER;
        break;
        case "SUMMER":
        season = Season.SUMMER;
        break;
        case "FALL":
        season = Season.FALL;
        break;
        case "SPRING":
        season = Season.SPRING;
        break;
        case default:
        System.out.println("fout");
        break;

        // try hierboven doet hetzelfde als deze lange versie.
        }*/
}

package week4.vrijdag;

import java.util.ArrayList;

public class OefArrayList {
    public static void main(String[] args) {
        ArrayList namen =  new ArrayList();
        namen.add("Jimi");
        namen.add("Janis");
        namen.add("Amy");
        namen.add("Kurt");
        namen.add("Jim");

        for (int i = 0; i < namen.size(); i++){
            System.out.println(namen.get(i));
        }

        System.out.println("---------");

        namen.remove(4);
        namen.remove(1);
        namen.remove(0);

        for (int i = 0; i < namen.size(); i++){
            System.out.println(namen.get(i));
        }

        System.out.println("----------");

        namen.remove("Amy");

        for (int i = 0; i < namen.size(); i++){
            System.out.println(namen.get(i));
        }


    }
}

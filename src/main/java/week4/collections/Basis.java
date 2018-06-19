package week4.collections;

import java.util.ArrayList;
import java.util.Date;

public class Basis {
    public static void main(String[] args) {
        ArrayList  getallen = new ArrayList();
        getallen.add(15);
        getallen.add(7);
        getallen.add(83);
        getallen.add(6);
        getallen.add(14);
        getallen.add(1);
        getallen.add(12);

        getallen.add(2, 5); // zet waarde 5 op index 2, alle andere waarden schuiven op, geen waarde verloren


        System.out.println(getallen.size());
        System.out.println(getallen.get(3));
        getallen.set(1,2); // vervangt waarde op index 1 door waarde 2
        System.out.println(getallen.get(1));
        System.out.println(2);

        System.out.println("-----------");

        ArrayList<String> names = new ArrayList<>();
        names.add("Ladida");
        names.add("Lololol");
        names.add("Lixilix");

        for (int i = 0; i< names.size(); i++){
            System.out.println(names.get(i).toUpperCase());
        }


        Date a = new Date();
        System.out.println(a);
        a.setYear(01);

        System.out.println(a);


    }
}

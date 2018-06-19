package week2;

import java.util.Scanner;

public class VectorPytha {
    public static void main(String[] args) {


        int[] r = {3,8};

        int x = r[0];
        int y = r[1];

        double vectorLengte = (x*x) + (y*y);

        vectorLengte = Math.sqrt(vectorLengte);

        System.out.println(vectorLengte);


    }
}

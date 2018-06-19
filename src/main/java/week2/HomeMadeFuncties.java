package week2;

import java.util.Scanner;

public class HomeMadeFuncties {

        public static int berekenRandomGetal (int min, int max){
            int randy = min + (int) (Math.random() * (max - min));
            return randy;
        }



        public static boolean isHetEenPriemgetal (int numbertotest){
            int kandidaat = 2;
            boolean isPriem = true;

            while (kandidaat < numbertotest){
                int r = numbertotest % kandidaat;
                if (r == 0) {
                    isPriem = false;
                }
                kandidaat++;
            }

            return isPriem;
        }




        public static void main(String[] args) {
            System.out.print("Geef de minimumwaarde op ");
            Scanner sc = new Scanner(System.in);
            int min = sc.nextInt();

            System.out.print("Geef de maximumwaarde op ");
            int max = sc.nextInt();

            int r = HomeMadeFuncties.berekenRandomGetal(min, max);
            System.out.println(r);




            boolean p = HomeMadeFuncties.isHetEenPriemgetal(r);

            if (p == true){
                System.out.println("Getal " + r + " is een priemgetal.");
            }else{
                System.out.println("Getal " + r + " is geen priemgetal.");
            }

        }


}

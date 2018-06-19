package week5;

public class Les {

   public static boolean isPrime(int n) {
       if (n <= 1) {
           return false;
       } else {

           for (int c = 2; c < n; c++) {
               if (n % c == 0) {
                   return false;
               }
           }
           return true;
       }
   }

}

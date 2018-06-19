package week2;

public class FizzBuzz {
    public static void main(String[] args) {
        int max = 25;
        int teller = 1;

        while (max > teller) {

            if (teller % 3 == 0 && teller % 5 ==0){
                System.out.println("FIZZBUZZ");
            }else {

                if (teller % 3 == 0) {
                    System.out.println("FIZZ");
                } else {

                    if (teller % 5 == 0) {
                        System.out.println("BUZZ");
                    } else {
                        System.out.println(teller);
                    }

                }
            }
            teller++;

        }
    }
}


package week2;

public class NumberPiramid {
    public static void main(String[] args) {
        int i = 0;
        int max = 7;

        while (i <= max){
            int power = (int) Math.pow(2, i);

            //count powers up
            for (int j = 0; j <= i; j++) {
                System.out.print((int)Math.pow(2, j ) + " ");
            }

            // count powers down
            for (int k = i-1; k >= 0; k--){
                System.out.print((int)Math.pow(2, k ) + " ");
            }

            System.out.println();

            i++;
        }

    }
}

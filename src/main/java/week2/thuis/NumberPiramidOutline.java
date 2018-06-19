package week2.thuis;

public class NumberPiramidOutline {
    public static void main(String[] args) {

        int i = 0;
        int max = 7;

        while (i <= max) {
            /*int power = (int)Math.pow(2,i);*/
            for (int j = 0; j<=i; j++){
                int tussenuitkomst = (int)Math.pow(2, j);
                System.out.print(tussenuitkomst + " ");
            }

            for (int k = i-1; k >= 0; k--){
                int tussenuitkomst = (int)Math.pow(2, k);
                System.out.print(tussenuitkomst + " ");
            }
            System.out.println();
            i++;
        }

    }
}

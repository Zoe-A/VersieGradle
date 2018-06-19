public class OpsommingLijntjes {
    public static void main(String[] args) {



        int getal = 1;

        while (getal < 101) {
            if ((getal%10) == 0){
                System.out.println(getal + " ");
            }else {
                System.out.print(getal + " ");

            }
            getal = getal + 1;
        }

    }
}

public class CookieCal {
    public static void main(String[] args) {
        short servingPerBag = 10;
        double calPerServing = 300;
        short cookiesPerBag = 40;
        double totalCal;
        int cookiesEaten = 4;


        double cookiesPerServing = cookiesPerBag / servingPerBag;

        double calPerCookie = calPerServing / cookiesPerServing;

        totalCal = calPerCookie * cookiesEaten;

        System.out.println(totalCal);





    }
}

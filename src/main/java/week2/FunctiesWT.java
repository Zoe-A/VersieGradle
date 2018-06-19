package week2;

public class FunctiesWT {
    public static void main(String[] args) {

        double a ;
        double r = 105;
        a = Math.PI*Math.pow(r,(double)2);
        System.out.println(a);

        double c ;
        double twee = 2;
        c = 2*Math.pow((Math.PI),twee);
        System.out.println(c);

        double d;
        double x = 5;
        d = (twee * x) + Math.sin(x/3);
        System.out.println(d);

        double e;
        double n = 4;
        e = (Math.log10(twee)*n) / Math.sqrt(n);
        System.out.println(e);

        double f;
        f = r + (3 * Math.sqrt(x)) + twee;
        System.out.println(f);

        double h;
        double g = 6.67e-11;
        double m1 = 3;
        double m2 = 9;
        h = g * ((m1 * m2)/r);
        System.out.println(h);


    }
}

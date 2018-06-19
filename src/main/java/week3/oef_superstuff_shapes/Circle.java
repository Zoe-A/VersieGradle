package week3.oef_superstuff_shapes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle extends Shape {
    private double pi, radius;

    @Override
    public void area(double[] x) {
        radius = x[0];
        pi = x[1];
        double area = pi * (radius * radius);
        DecimalFormat p = new DecimalFormat("0.0#");
        System.out.println("The area of a circle is " + p.format(area) + " cm2.");
    }

    @Override
    public void perimeter(double[] x) {
        radius = x[0];
        pi = x[1];
        double perimeter = 2 * pi* radius;
        DecimalFormat p = new DecimalFormat("0.0#");
        System.out.println("The perimeter of this circle is " + p.format(perimeter) + " cm.");
    }

    @Override
    public double[] askValueb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius in cm");
        a = sc.nextDouble();
        b = Math.PI;

        double[] cms = {a, b};
        return cms;

    }
}

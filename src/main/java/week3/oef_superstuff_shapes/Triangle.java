package week3.oef_superstuff_shapes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle extends Shape {
    private double base, height;

    @Override
    public void area(double[] x) {
        base = x[0];
        height = x[1];
        double area = (base*height)/2;
        DecimalFormat p = new DecimalFormat("0.0#");
        System.out.println("The area of this triangle is " + p.format(area) + " cm.");
    }

    @Override
    public void perimeter(double[] x) {

        System.out.println("The perimeter of the triangle is Whut?");
    }

    @Override
    public double[] askValueb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter base in cm");
        a = sc.nextDouble();
        System.out.println("Please enter height in cm");
        b = sc.nextDouble();

        double[] cms = {a, b};
        return cms;

    }
}

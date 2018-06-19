package week3.oef_superstuff_shapes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle extends Shape {
    private double width, height;


    @Override
    public void area(double[] x) {
        width = x[0];
        height = x[1];
        double area = width*height;
        DecimalFormat p = new DecimalFormat("0.0#");
        System.out.println("The area of the rectangle is " + p.format(area) + " cm2.");
    }

    @Override
    public void perimeter(double[] x) {
        width = x[0];
        height = x[1];
        double perimeter = 2*(width+height);
        DecimalFormat p = new DecimalFormat("0.0#");
        System.out.println("The perimeter of this rectangle is " + p.format(perimeter) + " cm.");
    }


    @Override
    public double[] askValueb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter width in cm");
        a = sc.nextDouble();

        System.out.println("Please enter height in cm");
        b = sc.nextDouble();

        double[] cms = {a, b};
        return cms;



    }

}

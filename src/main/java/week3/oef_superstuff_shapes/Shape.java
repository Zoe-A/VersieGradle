package week3.oef_superstuff_shapes;

public abstract class Shape {

    double a = 0, b = 0;

    public abstract void area (double[] x );
    public abstract void perimeter (double[] x);
    public abstract double[] askValueb();

    public static void main(String[] args) {

        Rommel shape1 = new Rommel();

        int choice = shape1.askInputShape();
        shape1.calculation(choice);




    }

}

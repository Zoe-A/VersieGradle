package week3.oef_superstuff_shapes;

import java.util.Scanner;


public class Rommel {
    private double[] x;

    public int askInputShape(){
        System.out.println("Please enter your shape of choice.");
        System.out.println("1: rectangle 2: triangle 3: circle");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        while (choice != 1 && choice != 2 && choice != 3){
            System.out.println("Please enter a valid shape");
            System.out.println("1: rectangle 2: triangle 3: circle");
            choice = sc.nextInt();
        }

        return choice;

    }

    public void calculation(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You chose Rectangle.");
                Rectangle s = new Rectangle();
                x = s.askValueb();
                s.area(x);
                s.perimeter(x);
                break;

            case 2:
                System.out.println("You chose Triangle.");
                Triangle t = new Triangle();
                x = t.askValueb();
                t.area(x);
                t.perimeter(x);
                break;

            case 3:
                System.out.println("You chose circle.");
                Circle c = new Circle();
                x = c.askValueb();
                c.area(x);
                c.perimeter(x);
                break;
        }

    }

}

import java.util.Scanner;

abstract class Shapes {
    double length , breadth , radius ;
    final static double pi = 3.14 ;
    Scanner sai = new Scanner(System.in);
    abstract void printArea();
}
class Circle extends  Shapes {
    @Override
    void printArea() {
        System.out.println("radius of circle : ");
        radius = sai.nextInt();
        System.out.println("Area of Circle is : "+pi*radius*radius );
    }
}

class Rectangle extends  Shapes {
    @Override
    void printArea() {
        System.out.println("length and breadth of rectangle : ");
        length = sai.nextByte();
        breadth = sai.nextByte();
        System.out.println("Area of Rectangle is : " + length*breadth);
    }
}

class Triangle extends Shapes {
    @Override
    void printArea() {
        System.out.println("length and breadth of triangle : ");
        length = sai.nextByte();
        breadth = sai.nextByte();
        System.out.println("Area of triangle is : "+ 0.5 * length * breadth);
    }
}

public class Experiment_11 {
    public static void main(String[] args) {
       Rectangle r = new Rectangle();
       r.printArea();

       Triangle t = new Triangle();
       t.printArea();

       Circle c = new Circle();
       c.printArea();

    }
}



public class Main {
    public static void main(String[] args) {

        MyPoint[] points = new MyPoint[10];

        // 05_01
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // 05_04

        MyPoint p1 = new MyPoint(-5, 8);
        MyPoint p2 = new MyPoint(4, 5);
        MyRectangle rectangle = new MyRectangle(p1, p2);
        System.out.println("-------------------------------");
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        if (rectangle.isSquare()){
            System.out.println("Rectangle is a square");
        }
        else{
            System.out.println("Rectangle is not a square");
        }
        System.out.println("-------------------------------");
    }
}

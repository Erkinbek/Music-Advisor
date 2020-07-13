abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    public double a;
    public double b;
    public double c;

    Triangle (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    double getPerimeter() {
        return a+b+c;
    }

    @Override
    double getArea() {
        double s = (a+b+c) / 2;
        return (s * (s - a) * (s - b) * (s - c));
    }
}

class Rectangle extends Shape {

    public double a;
    public double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {

    double r;

    Circle (double r) {
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 4 * Math.PI * r;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
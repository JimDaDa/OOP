public class Circle4 implements GeometricObject {

    protected double radius = 1.0;
    

    public Circle4(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2*this.radius *3.14);
    }

    @Override
    public double getArea() {
        return (this.radius * this.radius *3.14);
    }

    public String toString() {
        return "Circle :  radius = " +radius+ ", Area= " +getArea()+ ", Perimeter = " +getPerimeter();
    }

}
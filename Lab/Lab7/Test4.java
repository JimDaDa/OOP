public class Test4 {

    public static void main(String[] args) {
        GeometricObject a = new Circle4(6.3);
        System.out.println(a);
        System.out.println("Perimeter = "+a.getPerimeter());
        System.out.println("Area = "+a.getArea());

        Resizable b = new ResizableCircle(13.5);
        System.out.println(b);
       
        b.resize(135);

        GeometricObject c = (GeometricObject) b;
        System.out.println(c);
        System.out.println("Perimeter = "+c.getPerimeter());
        System.out.println("Area = "+c.getArea());
    }    
}

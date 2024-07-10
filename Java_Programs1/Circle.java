public class Circle {
    private final int rad;
    private final double pi = 3.14;

    public Circle(int rad){
        this.rad = rad;
    }

    public double area(){
        return (pi*rad*rad);
    }

    public double circumference(){
        return (2*pi*rad);
    }

    public static void main(String[] args){
        Circle circle = new Circle(5);

        System.out.println("Area: "+ circle.area());
        System.out.println("Circumference: "+ circle.circumference());
    }
}

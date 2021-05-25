package shapes;

public class Circle implements Shape{
    String className = this.getClass().getSimpleName();

    private double radius;

    Area area = () -> Math.pow(radius, 2) * Math.PI;

    @Override
    public String toString() {
        return className + " {r=" + getRadius() + "} perimeter = " + String.format("%.5f", getPerimeters());
    }

    @Override
    public double getPerimeters() {
        return 2 * Math.PI * getRadius();
    }

    public void getArea() {
        System.out.println("Area of " + className + ": " + String.format("%.4g",area.getArea()));
    }

    public Circle(){}

    public Circle(double radius) throws Exception {
        if(radius < 0){
            throw new Exception("Invalid radius!");
        }else{
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

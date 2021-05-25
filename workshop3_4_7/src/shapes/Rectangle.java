package shapes;

public class Rectangle implements Shape{
    String className = this.getClass().getSimpleName();
    private double length;
    private double width;

    Area area = () -> (length * width);

    @Override
    public String toString() {
        return className + " {w=" + getWidth() + ", h=" + getLength() + "} perimeter = " + String.format("%.4f",getPerimeters());
    }

    @Override
    public double getPerimeters() {
        return 2 * getLength() + 2 * getWidth();
    }

    public void getArea() {
        System.out.println("Area of " + className + ": " + String.format("%.4g",area.getArea()));
    }

    Rectangle(){}

    public Rectangle(double width, double length) throws Exception{
       if(width < 0 && length < 0){
           throw new Exception("Invalid side(s)!");
       }else{
           this.length = length;
           this.width = width;
       }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}

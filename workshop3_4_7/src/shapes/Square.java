package shapes;

public class Square implements Shape{
    String className = this.getClass().getSimpleName();
    private double length;

    Area area = () -> Math.pow(length, 2);

    @Override
    public String toString() {
        return className +" {s=" + getLength() + "} perimeter = " + String.format("%.4g",getPerimeters());
    }

    @Override
    public double getPerimeters() {
        return 4 * getLength();
    }

    public void getArea() {
        System.out.println("Area of " + className + ": " + String.format("%.4g",area.getArea()));
    }

    Square(){}

    public Square(double length) throws Exception {
        if(length < 0)
        {
            throw new Exception("Invalid side!");
        }else{
            this.length = length;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}

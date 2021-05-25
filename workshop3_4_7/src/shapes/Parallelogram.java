package shapes;

public class Parallelogram extends Rectangle{

    public Parallelogram(double width, double length) throws Exception{
        super(width, length);
    }

   public  Parallelogram(){super();}

    @Override
    public String toString() {
        return "Parallelogram {w=" + getWidth() + ", h=" + getLength() + "} perimeter = " + String.format("%.4f",getPerimeters());
    }

    @Override
    public void getArea() { }
}

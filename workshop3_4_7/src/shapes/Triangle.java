package shapes;

public class Triangle implements Shape{
    String className = this.getClass().getSimpleName();
    private double a;
    private double b;
    private double c;

    @Override
    public String toString() {
        return className + " {s1=" + getA() + ", s2=" + getB() + ", s3=" + getC() + "} parameter = " + String.format("%.4f",getPerimeters());
    }

    @Override
    public double getPerimeters() {
        return getA() + getB() + getC();
    }

    public Triangle(double a, double b, double c) throws Exception{
      if(a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a){
          throw new Exception("Invalid side(s)!");
      }else{
          this.a = a;
          this.b = b;
          this.c = c;
      }
    }

    public Triangle(){}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

}

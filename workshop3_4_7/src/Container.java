import shapes.Shape;
public class Container {
    private Shape[] collection = new Shape[50];
    int index = 0;

    public void add(Shape shape) {
        if(index != 50) {
            collection[index++] = shape;
        }
    }

    public double findMaxPerimeter(Shape shapeType){
        Shape max = null;
        for(Shape shape : collection){
            if(shape != null){
                if(shape.getClass() == shapeType.getClass()){
                    if(max == null){
                        max = shape;
                    }else {
                        double perimeter = shape.getPerimeters();
                        if(perimeter > max.getPerimeters()){
                            max = shape;
                        }
                    }
                }
            }
        }
        return max.getPerimeters();
    }

    public double findMinPerimeter(Shape shapeType){
        Shape min = null;
        for(Shape shape : collection){
            if(shape != null){
                if(shape.getClass() == shapeType.getClass()){
                    if(min == null){
                        min = shape;
                    }else {
                        double perimeter = shape.getPerimeters();
                        if(perimeter < min.getPerimeters()){
                            min = shape;
                        }
                    }
                }
            }
        }
        return min.getPerimeters();
    }

    public void removeByPerimeter(Shape shapeType, double perimeter){
        for(int i = 0; i < index; i++){
            if(collection[i] != null){
                if(collection[i].getPerimeters() == perimeter){
                    if(collection[i].getClass() == shapeType.getClass()){
                        collection[i] = null;
                    }
                }
            }
        }
    }

    public double accumulate(Shape shapeType){
        double sum = 0;
        for(Shape shape : collection){
            if(shape != null) {
                if(shape.getClass() == shapeType.getClass()){
                    sum += shape.getPerimeters();
                }
            }
        }
        return sum;
    }

    public void display(){
        for(Shape shape : collection){
            if(shape != null){
                System.out.println(shape);
            }
        }
    }
}
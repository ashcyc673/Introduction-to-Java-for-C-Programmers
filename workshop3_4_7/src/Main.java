import shapes.*;

public class Main {
    public static void task_1() {
        System.out.println("------->JAC 444 Assignment 1<-------");
        System.out.println("------->Task 1 ... <-------");

        Shape[] shape = new Shape[50];
        int index = 0;

        FileProcessor fileProcessor = new FileProcessor("shapes.txt");
        for (String line : fileProcessor.getFileData()) {
            if (line != null) {
                String[] buffer = line.split(",");
                try {
                    Shape temp = null;
                    switch (buffer[0]) {
                        case "Circle":
                            if (buffer.length == 2) {
                                double radius = Double.parseDouble(buffer[1]);
                                temp = new Circle(radius);
                            }
                            break;
                        case "Square":
                            if (buffer.length == 2) {
                                double length = Double.parseDouble(buffer[1]);
                                temp = new Square(length);
                            }
                            break;
                        case "Rectangle":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                temp = new Rectangle(width, height);
                            }
                            break;
                        case "Parallelogram":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                temp = new Parallelogram(width, height);
                            }
                            break;
                        case "Triangle":
                            if (buffer.length == 4) {
                                double side1 = Double.parseDouble(buffer[1]);
                                double side2 = Double.parseDouble(buffer[2]);
                                double side3 = Double.parseDouble(buffer[3]);
                                temp = new Triangle(side1, side2, side3);
                            }
                            break;
                    }
                    if (temp != null) shape[index++] = temp;
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
            }
        }
        System.out.printf("%d shapes were created%n", index);
        for (Shape shapes : shape) {
            if (shapes != null) {
                System.out.println(shapes);
            }
        }
    }

    public static void task_2() {
        System.out.println("------->Task 2 ... <-------");

        Container c = new Container();
        FileProcessor fileProcessor = new FileProcessor("shapes.txt");
        for (String line : fileProcessor.getFileData()) {
            if (line != null) {
                String[] buffer = line.split(",");
                try {
                    switch (buffer[0]) {
                        case "Circle":
                            if (buffer.length == 2) {
                                double radius = Double.parseDouble(buffer[1]);
                                c.add(new Circle(radius));
                            }
                            break;
                        case "Square":
                            if (buffer.length == 2) {
                                double length = Double.parseDouble(buffer[1]);
                                c.add(new Square(length));
                            }
                            break;
                        case "Rectangle":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                c.add(new Rectangle(width, height));
                            }
                            break;
                        case "Parallelogram":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                c.add(new Parallelogram(width, height));
                            }
                            break;
                        case "Triangle":
                            if (buffer.length == 4) {
                                double side1 = Double.parseDouble(buffer[1]);
                                double side2 = Double.parseDouble(buffer[2]);
                                double side3 = Double.parseDouble(buffer[3]);
                                c.add(new Triangle(side1, side2, side3));
                            }
                            break;
                    }

                } catch (Exception err) {

                }
            }
        }
        c.removeByPerimeter(new Triangle(), c.findMinPerimeter(new Triangle()));
        c.removeByPerimeter(new Circle(), c.findMaxPerimeter(new Circle()));
        c.display();
    }

    public static void task_3() {
        System.out.println("------->Task 3 ... <-------");
        Container c = new Container();
        FileProcessor fileProcessor = new FileProcessor("shapes.txt");
        for (String line : fileProcessor.getFileData()) {
            if (line != null) {
                String[] buffer = line.split(",");

                try {
                    switch (buffer[0]) {
                        case "Circle":
                            if (buffer.length == 2) {
                                double radius = Double.parseDouble(buffer[1]);
                                c.add(new Circle(radius));
                            }
                            break;
                        case "Square":
                            if (buffer.length == 2) {
                                double length = Double.parseDouble(buffer[1]);
                                c.add(new Square(length));
                            }
                            break;
                        case "Rectangle":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                c.add(new Rectangle(width, height));
                            }
                            break;
                        case "Parallelogram":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                c.add(new Parallelogram(width, height));
                            }
                            break;
                        case "Triangle":
                            if (buffer.length == 4) {
                                double side1 = Double.parseDouble(buffer[1]);
                                double side2 = Double.parseDouble(buffer[2]);
                                double side3 = Double.parseDouble(buffer[3]);
                                c.add(new Triangle(side1, side2, side3));
                            }
                            break;
                    }
                } catch (Exception err) {
                }
            }
        }
        c.removeByPerimeter(new Triangle(), c.findMinPerimeter(new Triangle()));
        System.out.printf("Total perimeter of Parallelogram is: %f%n", c.accumulate(new Parallelogram()));
        System.out.printf("Total perimeter of Triangle is: %.1f%n", c.accumulate(new Triangle()));
    }

    public static void task_4() {
        System.out.println("------->Task 4 ... <-------");

        Shape[] shape = new Shape[50];
        int index = 0;

        FileProcessor fileProcessor = new FileProcessor("shapes.txt");
        for (String line : fileProcessor.getFileData()) {
            if (line != null) {
                String[] buffer = line.split(",");
                try {
                    Shape temp = null;
                    switch (buffer[0]) {
                        case "Circle":
                            if (buffer.length == 2) {
                                double radius = Double.parseDouble(buffer[1]);
                                temp = new Circle(radius);
                            }
                            break;
                        case "Square":
                            if (buffer.length == 2) {
                                double length = Double.parseDouble(buffer[1]);
                                temp = new Square(length);
                            }
                            break;
                        case "Rectangle":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                temp = new Rectangle(width, height);
                            }
                            break;
                        case "Parallelogram":
                            if (buffer.length == 3) {
                                double width = Double.parseDouble(buffer[1]);
                                double height = Double.parseDouble(buffer[2]);
                                temp = new Parallelogram(width, height);
                            }
                            break;
                        case "Triangle":
                            if (buffer.length == 4) {
                                double side1 = Double.parseDouble(buffer[1]);
                                double side2 = Double.parseDouble(buffer[2]);
                                double side3 = Double.parseDouble(buffer[3]);
                                temp = new Triangle(side1, side2, side3);
                            }
                            break;
                    }
                    if (temp != null) shape[index++] = temp;
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
            }
        }
        System.out.printf("%d shapes were created%n", index);
        for (Shape shapes : shape) {
            if (shapes != null) {
                System.out.println(shapes);
                if (shapes instanceof Circle)
                    ((Circle) shapes).getArea();
                else if (shapes instanceof Square)
                    ((Square) shapes).getArea();
                else if (shapes instanceof Rectangle)
                    ((Rectangle) shapes).getArea();
            }
        }
    }

    public static void main(String[] args) {
//        task_1();
//        System.out.println();
//        task_2();
//        System.out.println();
//        task_3();
//        System.out.println();
        task_4();
    }
}

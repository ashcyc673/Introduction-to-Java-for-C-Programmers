public class Main {
    public static void main(String[] args) {
        ClassManager manager = new ClassManager();
        manager.createClassRoom();
        System.out.println();
        manager.saveToFile("classroom.txt");
        manager.loadFromFile("classroom.txt");
        manager.display();
    }
}

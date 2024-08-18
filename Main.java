// Make sure to use the same package name

public class Main {
    public static void main(String[] args) {
        // Creating a Cat object
        Pet cat = new Pet("Whiskers", "Siamese", "Female", 3, true);
        cat.call("Meow");
        cat.eat("fish");
        cat.sleep();
        
        // Creating a Dog object
        Pet dog = new Pet("Rex", "Labrador", "Male", 5, true);
        dog.call("Woof");
        dog.eat("bone");
        dog.sleep();
    }
}

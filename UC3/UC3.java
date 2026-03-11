public class UC3{

    public static void main(String[] args) {

        // Default name
        String name = "World";

        // Check if user provided an argument
        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("Hello, " + name + "!");
    }
}
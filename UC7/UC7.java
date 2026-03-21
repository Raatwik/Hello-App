public class UC7{
    public static void main(String[] args) {
        // 1. Detect missing arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // 2. Use String.join() to concatenate all arguments with a comma and space
            String names = String.join(", ", args);
            
            // 3. Display the final formatted greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}
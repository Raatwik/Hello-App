public class HelloApp {
    public static void main(String[] args) {
        // Step 1: Check if command-line arguments were provided
        if (args.length > 0) {
            
            // Step 2: Use StringBuilder to efficiently build the list of names
            // You could also use String.join(", ", args) for a more concise approach
            StringBuilder names = new StringBuilder();
            
public class UC4{
    public static void main(String[] args) {
        // Step 1: Check if command-line arguments were provided
        if (args.length > 0) {
            
            // Step 2: Use StringBuilder to efficiently build the list of names
            // You could also use String.join(", ", args) for a more concise approach
            StringBuilder names = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                
                // Add a comma and space if it's not the last element
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            
            // Step 3: Display the personalized greeting with all names
            System.out.println("Hello, " + names.toString() + "!");
            
        } else {
            // Step 4: Default to "World" if no arguments are provided
            System.out.println("Hello, World!");
        }
    }
}
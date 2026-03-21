public class UC6{
    public static void main(String[] args) {
        // 1. Detect missing arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // 2. Use StringBuilder for efficient string construction
            StringBuilder nameBuilder = new StringBuilder();

            // 3. Iterate through arguments using an enhanced for loop
            for (String name : args) {
                // Always append the same delimiter after each name
                nameBuilder.append(name).append(", ");
            }

            // 4. Check length to avoid errors, then remove trailing delimiter
            if (nameBuilder.length() > 0) {
                // Extract string from index 0 to the position just before the last two characters
                String formattedNames = nameBuilder.substring(0, nameBuilder.length() - 2);
                
                // 5. Display the final greeting
                System.out.println("Hello, " + formattedNames + "!");
            }
        }
    }
}
public class UC5{
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            // Step 2: Default handling for no arguments
            System.out.println("Hello, World!");
        } else {
            // Step 3: Use StringBuilder for efficient concatenation
            StringBuilder nameList = new StringBuilder();
            
            // Step 4: Enhanced For Loop (For-Each) to traverse all arguments
            for (String name : args) {
                // If the builder is not empty, add a comma separator before the next name
                if (nameList.length() > 0) {
                    nameList.append(", ");
                }
                nameList.append(name);
            }
            
            // Step 5: Print the single combined greeting
            System.out.println("Hello, " + nameList.toString() + "!");
        }
    }
}
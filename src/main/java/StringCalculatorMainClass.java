public class StringCalculatorMainClass {

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // Test cases to demonstrate output
        try {
            System.out.println("Add empty string: " + calculator.add("")); // Should print 0
            System.out.println("Add single number '5': " + calculator.add("5")); // Should print 5
            System.out.println("Add two numbers '1,2': " + calculator.add("1,2")); // Should print 3
            System.out.println("Add numbers with newline '1\\n2,3': " + calculator.add("1\n2,3")); // Should print 6
            System.out.println("Add numbers with custom delimiter '//;\\n1;2': " + calculator.add("//;\n1;2")); // Should print 3

            // Test case with negative numbers
            System.out.println("Add with negatives '1,-2,3,-4': " + calculator.add("1,-2,3,-4"));
        } catch (IllegalArgumentException e) {
            // Handle the exception and print it to the console
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

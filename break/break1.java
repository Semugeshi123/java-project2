public class break1{
    public static void main(String[] args) {
        // Experiment: Find the first even number in a loop

        int[] numbers = {1, 3, 5, 8, 9, 12, 15};

        System.out.println("Searching for the first even number...");

        for (int number : numbers) {
            System.out.println("Checking: " + number);

            if (number % 2 == 0) {
                System.out.println("Found the first even number: " + number);
                break; // Exit the loop once the first even number is found
            }
        }

        System.out.println("Experiment 1 completed.");
    }
}
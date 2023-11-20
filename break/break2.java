public class break2 {
    public static void main(String[] args) {
        // Experiment: Using break to exit nested loops

        outerLoop:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);

            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop iteration: " + j);

                if (i * j == 6) {
                    System.out.println("Breaking out of both loops");
                    break outerLoop; // Exit both loops when condition is met
                }
            }
        }

        System.out.println("Experiment 2 completed.");
    }
}
public class LabEratothenes {
    public static void main(String[] args) {
        int sizearry = 120;
        boolean numbers[] = new boolean[sizearry + 1];

        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + sizearry);

        for (int i = 0; i <= sizearry; i++) {
            numbers[i] = true;
        }

        for (int b = 2; b * b <= sizearry; b++) {
            // If prime[b] is not changed, then it is a prime
            if (numbers[b] == true) {
                // Update all multiples of b
                for (int i = b * b; i <= sizearry; i += b)
                    numbers[i] = false;
            }
        }

        // Print all prime numbers
        for (int c = 2; c <= sizearry; c++) {
            if (numbers[c] == true)
                System.out.print(c + " ");
        }
    }
}

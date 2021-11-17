public class LabPattern3 {
    public static void main(String[] args) {
        pattern3();
    }

    private static void pattern3() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("o ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}

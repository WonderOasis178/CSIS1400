public class HoppityHop {
    public static void main(String[] args) {
        hoppityHop(25);
    }

    private static void hoppityHop(int max) {
        for (int n = 1; n <= max; n++) {
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println("hoppity hop");
            else if (n % 5 == 0)
                System.out.println("hop");
            else if (n % 3 == 0)
                System.out.println("hoppity");
            else
                System.out.println(n);
        }
    }
}
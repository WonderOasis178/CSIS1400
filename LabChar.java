public class LabChar {
    public static void main(String[] args) {
        char dash = '-';
        System.out.printf("Dash: %c\n", dash);

        char a = 'a';
        char letter = 'a';
        char b = ++letter;
        char c = ++letter;
        letter += 2;
        char e = letter;
        char copyrightSign = '\u00A9';
        char yen = '\u00A5';
        System.out.printf("Letter:%c var a:%c var b:%c var c:%c var e:%c\n", letter, a, b, c, e);
        System.out.printf("Copyright sign:%c decimal:%d hex:%X\n", copyrightSign, (int) copyrightSign,
                (int) copyrightSign);
        System.out.printf("Yen:%c decimal:%d hex:%04X%n", yen, (int) yen, (int) yen);

    }
}
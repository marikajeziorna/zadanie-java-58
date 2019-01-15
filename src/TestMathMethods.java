public class TestMathMethods {
    public static void main(String[] args) {
        MathMethods mathMethods = new MathMethods();
        boolean integer1 = mathMethods.isEven(5);
        System.out.println("True zwracane jest dla liczby parzystej, a false dla nieparzystej. Następująca licznba ma flagę: " + integer1);

        boolean integer2 = !mathMethods.isOdd(4);
        System.out.println("True jest zwracane jeśli liczba jest nieparzysta, a false jeśli liczba jest parzysta. Następująca licznba ma flagę: " + integer2);

        double circleField = mathMethods.circleField(3.5);
        System.out.println("Pole koła wynosi: " + circleField);

        double power = mathMethods.power(3, 2);
        System.out.println("Wartość dla liczby całkowitej podniesionej do potęgi drugiej wynosi: " + power);
    }
}
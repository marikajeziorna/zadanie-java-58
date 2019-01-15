public class MathMethods {

    boolean isEven(int a) {
        boolean integer1 = a % 2 == 0;
        return integer1;
    }

    boolean isOdd(int b) {
        boolean integer2 = b % 2 == 0;
        return integer2;
    }

    double circleField(double r) {
        double wheelRadius = Math.PI * r * r;
        return wheelRadius;
    }

    double power(int p, double z) {
        double doublePower = Math.pow(p, 2);
        return doublePower;
    }
}



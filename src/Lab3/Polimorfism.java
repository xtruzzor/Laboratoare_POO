package Lab3;


public class Polimorfism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.add(5.3, 10.5));
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}


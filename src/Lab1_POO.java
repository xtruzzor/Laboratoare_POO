public class Lab1_POO {
    public static void main(String[] args) {
        // a. Condiții
        int a = 10;
        int b = 5;

        if (a > b) {
            System.out.println("a este mai mare decât b.");
        } else if (a < b) {
            System.out.println("a este mai mic decât b.");
        } else {
            System.out.println("a este egal cu b.");
        }

        // b. Variabile
        int numarIntreg = 42;
        double numarReal = 3.14;
        String text = "Exemplu de text.";

        // c. Mase de date
        int[] numere = {1, 2, 3, 4, 5};
        System.out.println("Al treilea element al masei este: " + numere[2]);

        // d. Excepții
        try {
            int rezultat = numere[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A apărut o excepție: " + e.getMessage());
        }

        // e. Liste
        java.util.List<String> listaCuvinte = new java.util.ArrayList<>();
        listaCuvinte.add("Primul");
        listaCuvinte.add("Al doilea");
        listaCuvinte.add("Al treilea");
        System.out.println("Numărul de cuvinte în listă: " + listaCuvinte.size());

    }
}

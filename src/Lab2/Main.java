package Lab2;

public class Main {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("Lenovo","IDEAPAD Gaming 3", "Black", 2021);
        Car car = new Car("Porsche", "911 Turbo S", 2020, 330);
        Student student = new Student("Liviu Munteanu", "CIM", "IT", 2);
        Book book = new Book("Scurtă istorie a timpului", "Stephen Hawking", "Știință", 1994);


        System.out.println(notebook);
        notebook.setYear(2022);
        System.out.println("After the changes");
        System.out.println("Year: " + notebook.getYear());

        System.out.println(car);
        car.setMaxSpeed(600);
        System.out.println("After the changes");
        System.out.println("Max Speed " + car.getMaxSpeed() + " km/h");

        System.out.println(student);
        student.setSpecialization("FI");
        System.out.println("After the changes");
        System.out.println("Specialization: " + student.getSpecialization());

        System.out.println(book);
        book.setAuthor("Stephen W. Hawking");
        System.out.println("After the changes");
        System.out.println("Author: " + book.getAuthor());

    }
}
package Lab2;

public class Student {

    private String name;
    private String faculty;
    private String specialization;
    private int year;

    public Student(String name, String faculty, String specialization, int year) { // Aici, schimbăm numele atributului
        this.name = name;
        this.faculty = faculty;
        this.specialization = specialization;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        String message = "\n\nStudent Characteristics:\n";
        return String.format("%sName: %s\nFaculty: %s\nSpecialization: %s\nYear: %d\n", message, this.name, this.faculty, this.specialization, this.year);
    }
}

package Lab2;
public class Car {

    private String name;
    private String model;
    private int year;
    private int maxSpeed;

    public Car(String name, String model, int year, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        String message = "\n\nCar Characteristics:\n";
        return String.format("%sName: %s\nModel: %s\nYear: %d\nMax Speed: %d km/h\n",
                message, this.name, this.model, this.year, this.maxSpeed);
    }
}

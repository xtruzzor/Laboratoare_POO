package Lab2;

public class Notebook {

    private String name;
    private String model;
    private String color;
    private int year;

    public Notebook (String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        String message = "Notebook Characteristics: \n";
        return String.format("%sName: %s\nModel: %s\nColor: %s\nYear: %d\n", message, this.name, this.model, this.color, this.year);
    }
}

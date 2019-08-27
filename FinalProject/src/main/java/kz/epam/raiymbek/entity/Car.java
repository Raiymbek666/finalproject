package kz.epam.raiymbek.entity;

public class Car {
    private int carId;
    private String mark;
    private String model;
    private int year;
    private String color;
    private static int defaultId = 100000;

    public Car(int carId) {
        this.carId = carId;
    }

    public Car(int carId, String mark, String model, int year, String color) {
        this.carId = carId;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(String mark, String model, int year, String color) {
        this.carId = --defaultId;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}

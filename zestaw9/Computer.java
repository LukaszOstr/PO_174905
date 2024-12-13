package zestaw9;

import java.util.Objects;

public class Computer {
    String brand;
    String model;
    Processor processor;

    public Computer(String brand, String model, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(getBrand(), computer.getBrand()) && Objects.equals(getModel(), computer.getModel()) && Objects.equals(getProcessor(), computer.getProcessor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getProcessor());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor=" + processor +
                '}';
    }
}


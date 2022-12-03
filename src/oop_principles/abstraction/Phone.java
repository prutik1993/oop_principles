package oop_principles.abstraction;

public abstract class Phone {
    public Phone(){}

    public Phone(int storage, String model, String color, double price) {
        this.storage = storage;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public int storage;
    public String model;
    public String color;
    public double price;

    public abstract void call(); // created to be  implemented for sub-classes
    public abstract void text(); // created to be  implemented for sub-classes

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "storage=" + storage +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

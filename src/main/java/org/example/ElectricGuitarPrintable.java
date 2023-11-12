package org.example;

class ElectricGuitarPrintable extends ElectricGuitar implements Printable {
    public ElectricGuitarPrintable(String brand, String model, int numberOfPickups) {
        super(brand, model, numberOfPickups);
    }

    @Override
    public void print() {
        System.out.println("Electric Guitar: " + getBrand() + " " + getModel() + ", Pickups: " + getNumberOfPickups());
    }
}

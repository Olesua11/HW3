package org.example;

class AcousticGuitarPrintable extends acousticGuitar implements Printable {
    public AcousticGuitarPrintable(String brand, String model, String bodyType) {
        super(brand, model, bodyType);
    }

    @Override
    public void print() {
        System.out.println("Acoustic Guitar: " + getBrand() + " " + getModel() + ", Body Type: " + getBodyType());
    }
}

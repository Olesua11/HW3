package org.example;

class BassGuitarPrintable extends BassGuitar implements Printable {
    public BassGuitarPrintable(String brand, String model, boolean hasFretlessNeck) {
        super(brand, model, hasFretlessNeck);
    }

    @Override
    public void print() {
        System.out.println("Bass Guitar: " + getBrand() + " " + getModel() + ", Fretless: " + isHasFretlessNeck());
    }
}

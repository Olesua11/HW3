package org.example;


class BassGuitar extends Guitar {
    private boolean hasFretlessNeck;

    public BassGuitar(String brand, String model, boolean hasFretlessNeck) {
        super(brand, model);
        this.hasFretlessNeck = hasFretlessNeck;
    }


    public boolean isHasFretlessNeck() {
        return hasFretlessNeck;
    }
}

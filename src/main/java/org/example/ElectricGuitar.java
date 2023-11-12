package org.example;

import org.example.Guitar;

class ElectricGuitar extends Guitar {
    private int numberOfPickups;

    public ElectricGuitar(String brand, String model, int numberOfPickups) {
        super(brand, model);
        this.numberOfPickups = numberOfPickups;
    }

    public int getNumberOfPickups() {
        return numberOfPickups;
    }
}
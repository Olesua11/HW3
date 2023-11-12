package org.example;

  abstract class Guitar {
    private String brand;
    private String model;

    public Guitar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}


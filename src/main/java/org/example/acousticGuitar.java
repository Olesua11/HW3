package org.example;



class acousticGuitar extends Guitar {
    private String bodyType;

    public acousticGuitar(String brand, String model, String bodyType) {
        super(brand, model);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }
}

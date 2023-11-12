package org.example;

class Main {

        public static Guitar createObject(String className) {
        switch (className) {
            case "2й":
                return new ElectricGuitarPrintable("Gibson", "Les Paul", 2);
                case "3й":
                return new AcousticGuitarPrintable("Martin", "D-28", "Dreadnought");
            case "4й":
                return new BassGuitarPrintable("Fender", "Precision", true);
            default:
                return null;
        }
    }
    public static void main(String[] args) {

        Guitar electricGuitar = createObject("2й");
        Guitar acousticGuitar = createObject("3й");
        Guitar bassGuitar = createObject("4й");

        Guitar[] guitars = {electricGuitar, acousticGuitar, bassGuitar};
        for (Guitar guitar : guitars) {
            if (guitar instanceof Printable) {
                ((Printable) guitar).print();
            }
        }
    }
}






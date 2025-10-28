package mx.edu.matricez;

public class Auto {
    private String model;
    private int milesDriver;
    private double gallonsOFGas;

    public Auto() {
        this.model = "Unknown";
    }

    public Auto(String model, int milesDriver, double gallonsOFGas) {
        this.model = model;
        this.setMilesDriver(milesDriver);
        this.setGallonsOFGas(gallonsOFGas);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilesDriver() {
        return milesDriver;
    }

    public void setMilesDriver(int milesDriver) {
        if (milesDriver >= 0) {
            this.milesDriver = milesDriver;
        } else {
            System.out.println("Miles driven cannot be negative. Value not changed.");
        }
    }

    public double getGallonsOFGas() {
        return gallonsOFGas;
    }

    public void setGallonsOFGas(double gallonsOFGas) {
        if (gallonsOFGas >= 0.0) {
            this.gallonsOFGas = gallonsOFGas;
        } else {
            System.out.println("Gallons of Gas cannot be negative. Value not changed.");
        }
    }

    public double calculateMilesPerGallon() {
        if (getGallonsOFGas() != 0.0) {
            return milesDriver / getGallonsOFGas();
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", milesDriver=" + milesDriver +
                ", gallonsOFGas=" + gallonsOFGas +
                '}';
    }
}

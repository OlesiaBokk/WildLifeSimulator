package cy.olesiabokk.wildlifeapp.entity;

public class Manul {
    private int healthPoint = 100;
    private int energy = 100;
    private final double jawCoefficient = 1.8;

    public int getHealthLevel() {
        return healthPoint;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthPoint = healthLevel;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getJawCoeff() {
        return jawCoefficient;
    }
}

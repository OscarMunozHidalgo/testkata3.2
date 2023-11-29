package software.ulpgc.kata2;

public class Water {
    private double ph;
    private double hardness;
    private double solids;
    private int potability;

    public Water(double ph, double hardness, double solids, int potability) {
        this.ph = ph;
        this.hardness = hardness;
        this.solids = solids;
        this.potability = potability;
    }

    public double getPh() {
        return ph;
    }

    public double getHardness() {
        return hardness;
    }

    public double getSolids() {
        return solids;
    }

    public int getPotability() {
        return potability;
    }
}

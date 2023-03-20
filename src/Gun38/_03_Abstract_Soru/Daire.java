package Gun38._03_Abstract_Soru;

public class Daire extends Sekil{
    private double yariCap;

    public Daire(double yariCap) {
        setYariCap(yariCap);
    }

    @Override
    double alan() {
        return Math.PI*yariCap*yariCap;
    }

    @Override
    double cevre() {
        return Math.PI*yariCap*2;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }
}

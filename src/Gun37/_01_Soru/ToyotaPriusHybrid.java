package Gun37._01_Soru;

public class ToyotaPriusHybrid extends Vehicle implements IElectric,IGas{
    public ToyotaPriusHybrid(String model, Double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Ömür boyu kullan";
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300km gider";
    }

    @Override
    public String drive() {
        return "ilk 3 km elektrikle gider";
    }
}

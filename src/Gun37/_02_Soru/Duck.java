package Gun37._02_Soru;

public class Duck implements Sailing,Flying{
    @Override
    public String food() {
        return "otçul";
    }

    @Override
    public String nasilUcuyor() {
        return "çok az uçar";
    }

    @Override
    public String nasilYuzuyor() {
        return "denizin üstünden yüzer";
    }
}

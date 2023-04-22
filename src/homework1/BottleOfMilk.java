package homework1;

public class BottleOfMilk extends Product{
    private int volume;
    private int fat; // жирность

    public int getVolume() {
        return volume;
    }

    public BottleOfMilk(String name, double price, int volume, int fat){
        super(name, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %f - объем: %d", brand, name, price, volume);
    }
}

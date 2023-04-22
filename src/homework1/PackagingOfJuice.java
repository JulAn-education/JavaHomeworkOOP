package homework1;

public class PackagingOfJuice extends Product{
    private int volume; // объем
    private String taste; // вкус

    public int getVolume() {
        return volume;
    }

    public String getTaste() {
        return taste;
    }

    public PackagingOfJuice(String name, double price, int volume, String taste){
        super (name, price);
        this.volume = volume;
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %f - объем: %d - со вкусом: %s ", name, price, volume, taste);
    }
}

package homework1;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    // конструктор
    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getbottleOfWater(String name, int volume){
        for (Product product: products) {
            // провнряем, что продукт относится именно к типу BottleOfWater
            if (product instanceof BottleOfWater){
                BottleOfWater bottle = ((BottleOfWater) product);
                if(bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }

        }
        return null;
    }

    public PackagingOfJuice getPackagingOfJuice(String name, int volume, String taste){
        for (Product product: products){
            if (product instanceof PackagingOfJuice){
                PackagingOfJuice pack = ((PackagingOfJuice) product);
                if(pack.name.equals(name) && pack.getVolume() == volume && pack.getTaste().equals(taste))
                    return pack;
            }
        }
        return null;
    }
}

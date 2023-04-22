package homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product bottleOfWater1 = new BottleOfWater("Боржоми", 101.10, 1);
        Product bottleOfMilk1 = new BottleOfMilk("Простоквашино", 100.30, 1, 4);
        Product bottleOfWater2 = new BottleOfWater("Святой источник", 60.20, 1);
        Product bottleOfWater3 = new BottleOfWater("Боржоми", 120.10, 2);
        Product bottleOfWater4 = new BottleOfWater("Святой источник", 110.10, 2);

        Product packagingOfJuice1 = new PackagingOfJuice("Добрый", 105.30, 1, "orange");
        Product packagingOfJuice2 = new PackagingOfJuice("Добрый", 105.30, 2, "apple");
        Product packagingOfJuice3 = new PackagingOfJuice("Rich", 130.10, 1, "peach");
        Product packagingOfJuice4 = new PackagingOfJuice("Rich", 130.10, 1, "orange");
        Product packagingOfJuice5 = new PackagingOfJuice("Добрый", 100.30, 1, "apple");
        Product packagingOfJuice6 = new PackagingOfJuice("Rich", 100.30, 2, "cherry");


        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);

        products.add(packagingOfJuice1);
        products.add(packagingOfJuice2);
        products.add(packagingOfJuice3);
        products.add(packagingOfJuice4);
        products.add(packagingOfJuice5);
        products.add(packagingOfJuice6);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWaterRes = vendingMachine.getbottleOfWater("Боржоми", 2);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки нет в автоматею");
        }


        PackagingOfJuice packagingOfJuiceRes = vendingMachine.getPackagingOfJuice("Rich", 1, "orange");
        if (packagingOfJuiceRes != null){
            System.out.println("Вы купили: ");
            System.out.println(packagingOfJuiceRes.displayInfo());
        }
        else {
            System.out.println("Нет такого сока в автомате.");
        }

    }

}
package homework2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Пушок", 15, false);
        Cat cat2 = new Cat("Барсик", 20, false);
        Cat cat3 = new Cat ("Том", 10, false);
        Cat cat4 = new Cat ("Муська", 12, false);
        Cat cat5 = new Cat ("Рыжик", 23, false);
        Cat cat6 = new Cat ("Черныш", 25, false);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);

        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat: cats){
            cat.eat(plate);
            plate.info();
        }
    }
}

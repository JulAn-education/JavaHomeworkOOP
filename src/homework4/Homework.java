package homework4;

import java.util.ArrayList;
import java.util.List;

/**
 * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 * Можно сравнивать коробки с яблоками и апельсинами;
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * g. Не забываем про метод добавления фрукта в коробку.
 */

public class Homework {
    public static void main(String[] args) {

        Box<Apple> apples = new Box<>();
        Apple apple = new Apple();
        apples.addBox(apple);
        apples.addBox(apple);
        apples.addBox(apple);
        System.out.println(apples.getWeight());

        Box<Orange> oranges = new Box<>();
        Orange orange = new Orange();
        oranges.addBox(orange);
        oranges.addBox(orange);
        //oranges.addBox(orange);
        System.out.println(oranges.getWeight());
        System.out.println(oranges.compare(apples.getFruits()));

    }

}

abstract class Fruit{

    private final float weight;

    public float getWeight() {

        return weight;
    }

    public Fruit(float weight) {

        this.weight = weight;
    }
}

class Apple extends Fruit {

    public Apple() {

        super(1.0f);
    }
}

class Orange extends Fruit {

    public Orange() {

        super(1.5f);
    }
}

class Box<T extends Fruit> {

    ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public Box(){
        this.fruits = new ArrayList<>();
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight() {

        return (float) fruits.size()*fruits.get(0).getWeight();
    }

    public boolean compare(List<? extends Fruit> fruits1){
        float count = fruits1.size()*fruits1.get(0).getWeight();
        float count1 = fruits.size()*fruits.get(0).getWeight();
        if (count == count1) {
            return true;
        }
        else {
            return false;
        }
    }

    public List<T> pourOver(List<T> fruits2) {
        fruits2.addAll(fruits);
        fruits.clear();
        return fruits2;
    }

    public void addBox(T fruit) {

        fruits.add(fruit);
    }


}


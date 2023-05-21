package homework6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    /**
     * TODO: Домашняя работа (программа 1),
     *  оптимизировать приложение в соответствии с принципом SOLID - SRP
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Укажите заказ:");
        Order order = new Order("Nnn", "hhh", 5, 333);

        SaveInterface saveJson = new SaveToJson();
        saveJson.save(order, "order.json");
        InputOrder inputOrder = new InputOrder();
        Order order1 = inputOrder.inputFromConsole();
        SaveInterface saveFile = new SaveToFile();
        saveFile.save(order1, "file.txt");

    }
}

package homework6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile implements SaveInterface{


    @Override
    public void save(Order order, String path) {
        File file = new File(path);
        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            bf.write("{\n");
            bf.write("clientName:"+ order.getClientName() + "\n");
            bf.write("product:"+order.getProduct()+"\n");
            bf.write("qnt:"+order.getQnt()+"\n");
            bf.write("price:"+order.getPrice()+"\n");
            bf.write("}\n");
            bf.flush();
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

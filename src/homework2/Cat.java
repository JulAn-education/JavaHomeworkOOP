package homework2;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;

    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood() && !full) {
            System.out.println(name + " покушал.");
            plate.setFood(plate.getFood() - appetite);
            full = true;
        } else {
            System.out.println(name + " мало еды.");
        }
    }
}

package VendingMachineProject;

public abstract class Product extends VendingMachine {
    private double cost;
    private String name;

    public Product(double cost, String name) {
        this.cost = cost;
        this.name = name;
        // super(products).add()
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Наименование: " + name + "; Cтоимость: " + cost;
    }
}
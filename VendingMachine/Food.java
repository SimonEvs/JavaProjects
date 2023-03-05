package VendingMachineProject;

public class Food extends Product {
    // private String name;
    private double weight;

    public Food(double cost, String name, double weight) {
        super(cost, name);
        this.weight = weight;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "; Вес: " + getWeight() + " грамм.";
    }
}

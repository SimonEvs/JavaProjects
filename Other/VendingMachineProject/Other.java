package Other.VendingMachineProject;

public class Other extends Product {

    private String size;
    // private String name;

    public Other(double cost, String name, String size) {
        super(cost, name);
        this.size = size;
    }

    // @Override
    // public double getCost() {
    // return getCost();
    // }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        if (getSize() == null) {
            return super.toString() + " рублей";
        } else {
            return super.toString() + " рублей; Размер: " + getSize() + ".";
        }
    }
}

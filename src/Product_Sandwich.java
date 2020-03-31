public class Product_Sandwich extends Product{
    private String type;

    public Product_Sandwich(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Sandwich{" + getName() + "; " + getType() + "; " + getPrice() + "}";
    }
}

package flower.store;

abstract class Item {
    private String description;

    public Item() {}
    public Item(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    abstract double getPrice();
}

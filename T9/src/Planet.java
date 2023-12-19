// Пример класса, представляющего собаку с именем и ценой
class Planet implements Nameable, Priceable {
    private String name;
    private double price;

    public Planet(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
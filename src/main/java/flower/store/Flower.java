package flower.store;

import lombok.Getter;
import lombok.Setter;

import static flower.store.FlowerType.DEFAULT;
import static flower.store.FlowerType.TULIP;


@Setter
public class Flower {
    @Getter
    private double sepalLength = 0;
    private FlowerColor color = FlowerColor.NONE;
    @Getter
    private double price = 0;
    @Getter
    private FlowerType flowerType = DEFAULT;

    public  Flower(){

    };
    public Flower(double sepalLength, FlowerColor color, double price, FlowerType type) {
        this.color = color;
        this.sepalLength = sepalLength;
        this.flowerType = type;
        this.price = price;
    }
    public String getColor() {
        return color.toString();
    }

    public String getType() { return flowerType.toString(); }

//    @Override
    public String toString() {
        String name = this.getColor();
        name += " ";
        name += this.getType();
        name += " ";
        name += "PRICE: ";
        name += Double.toString(this.price);
        return name;
    }
}

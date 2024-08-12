package Product;

public class Phone extends Product {
    private int batteryCapacityInMh;
    private String color;

    public Phone (int id, double price, double discountRate, int stock, String name, Brand brand, int storage, int screenSize, int ram, int batteryCapacityInMah, String color) {
        super(id, price, discountRate, stock, name, brand, storage, screenSize, ram);
        this.batteryCapacityInMh = batteryCapacityInMah;
        this.color = color;
    }
    public Phone () {

    }
    public int getBatteryCapacityInMh () {
        return batteryCapacityInMh;
    }

    public String getColor () {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-5d Mah | %-12s |", batteryCapacityInMh, color);
    }

}

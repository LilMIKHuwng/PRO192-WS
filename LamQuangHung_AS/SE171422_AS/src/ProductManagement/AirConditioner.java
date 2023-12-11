
package ProductManagement;

public class AirConditioner extends Product{
    private int power;

    public AirConditioner(String code, String name, String brand,
            int power, int price, int quantity) {
        super(code, name, brand, price, quantity);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    @Override
    public String toString() {
        return getCode() + "-" + getName() + "-" + getBrand()
                + "-" + power + "-" + getPrice() + "-" + getQuantity();
    }
    
}

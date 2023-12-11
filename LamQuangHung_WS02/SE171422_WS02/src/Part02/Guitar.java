
package Part02;

public class Guitar {

    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar() {
    }

    public Guitar(String serialNumber, int price, String builder,
            String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getserialNumber() {
        return serialNumber;
    }

    public void setserialNumber(String serialNumber) {
        if (!serialNumber.equals(null)) {
            this.serialNumber = serialNumber;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getbackWood() {
        return backWood;
    }

    public void setbackWood(String backWood) {
        this.backWood = backWood;
    }

    public String gettopWood() {
        return topWood;
    }

    public void settopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println("serialNumber: " + getserialNumber());
        System.out.println("price: " + getPrice());
        System.out.println("buider: " + getBuilder());
        System.out.println("model: " + getModel());
        System.out.println("backWood: " + getbackWood());
        System.out.println("topWood: " + gettopWood());
    }
}

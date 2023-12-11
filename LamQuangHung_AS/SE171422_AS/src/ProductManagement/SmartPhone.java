
package ProductManagement;

public class SmartPhone extends Product{
    private String ram, cpu;
    private int size;

    public SmartPhone( String code, String name, String brand, 
            String ram, String cpu, int size, int price, int quantity) {
        super(code, name, brand, price, quantity);
        this.ram = ram;
        this.cpu = cpu;
        this.size = size;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
 
    @Override
    public String toString() {
        return getCode() + "-" + getName() + "-" + getBrand() + "-"
            + ram + "-" + cpu + "-" + size + "-" + getPrice() + "-" + getQuantity();
    }
     
}

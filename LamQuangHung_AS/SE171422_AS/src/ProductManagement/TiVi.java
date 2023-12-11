
package ProductManagement;

public class TiVi extends Product{
    private int size;

    public TiVi( String code, String name, String brand,
            int size, int price, int quantity) {
        super(code, name, brand, price, quantity);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getCode() + "-" + getName() + "-" + getBrand()
                + "-" + size + "-" + getPrice() + "-" + getQuantity();
    }
     
}

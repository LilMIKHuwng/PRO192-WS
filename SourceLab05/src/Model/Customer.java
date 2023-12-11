
package Model;

public class Customer {
    private int CustomerID;
    private String name;
    private String phone;

    public Customer() {
    }

    public Customer(int CustomerID, String name, String phone) {
        this.CustomerID = CustomerID;
        this.name = name;
        this.phone = phone;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Company{" + "CustomerID=" + CustomerID + ", name=" + name + ", phone=" + phone + '}';
    }
}

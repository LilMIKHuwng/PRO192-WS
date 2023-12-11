
package Part02;

public class Employee {
    String code;
    String fullname;
    int age;
    String address;
    long salary;

    public Employee(String code, String fullname, 
            int age, String address, long salary) {
        this.code = code;
        this.fullname = fullname;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  code + " - " + fullname + " - " + 
                age + " - " + address + " - " + salary ;
    }
    
    
}

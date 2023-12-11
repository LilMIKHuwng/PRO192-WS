
package FPTSoftware;

class FullTimeEmployee extends Employee{
    private double salary;
    private int absent;

    public FullTimeEmployee(String code, String name,
            String phone, String address, String department,
            double salary, int absent) {
        super(code, name, phone, address, department);
        this.salary = salary;
        this.absent = absent;
    }
    
    @Override
    public double totalSalary(){
        return salary - (absent * 35);
    }

    @Override
    public String viewInfor() {
        return getCode() + " - " + getName() + " - " + totalSalary();
    }   
}

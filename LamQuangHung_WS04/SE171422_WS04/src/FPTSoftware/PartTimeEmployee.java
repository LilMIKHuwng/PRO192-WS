
package FPTSoftware;

class PartTimeEmployee extends Employee{
    private double dailyWage;
    private int present;

    public PartTimeEmployee(String code, String name,
            String phone, String address, String department,
            double dailyWage, int present) {
        super(code, name, phone, address, department);
        this.dailyWage = dailyWage;
        this.present = present;
    }
    
    @Override
    public double totalSalary(){
        return dailyWage * present;
    }

    @Override
    public String viewInfor() {
        return getCode() + " - " + getName() + " - " + totalSalary();
    }
}

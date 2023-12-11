
package Part03;

public class Employee {
    private String Code;
    private String Fullname;
    private String Phone;
    private double Salary;
    private double SalaryCoefficient;
    private String department;

    public Employee(String Code, String Fullname, String Phone,
            double Salary, double SalaryCoefficient, String department) {
        this.Code = Code;
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.Salary = Salary;
        this.SalaryCoefficient = SalaryCoefficient;
        this.department = department;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getSalaryCoefficient() {
        return SalaryCoefficient;
    }

    public void setSalaryCoefficient(double SalaryCoefficient) {
        this.SalaryCoefficient = SalaryCoefficient;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return  Code + " - " + Fullname + " - " + Phone + " - "
        + Salary + " - " + SalaryCoefficient + " - " + department ;
    }
    
    
}

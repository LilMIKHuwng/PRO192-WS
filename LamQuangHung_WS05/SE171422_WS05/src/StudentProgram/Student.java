
package StudentProgram;

public class Student {
    private String code;
    private String name;
    private double mark;

    public Student(String code, String name, double mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return  code + " - " + name + " - " + mark ;
    }
}

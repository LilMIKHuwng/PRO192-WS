package StudentProgram;

import java.util.ArrayList;

public class ListStudent {

    ArrayList<Student> liststudent = new ArrayList<>();

    public void createStudent() {

        System.out.println("Create a new Student ");
        String code;
        String name;
        double mark;

        boolean check = true;
        do {
            code = Utils.getStringreg("Enter Code: ", "^(?i)(SE|HE|QE)\\d{4,6}$",
                    "Code cannot is empty", "Wrong code format");
            if (checkCode(code)) {
                System.out.println("Same code");
            } else {
                check = false;
            }
        } while (check);
        name = Utils.getString("Enter Fullname: ",
                "Fullname cannot is empty");
        mark = Utils.getDouble("Enter Mark: ", 0, 10);
        Student stu = new Student(code, name, mark);
        liststudent.add(stu);
        System.out.println("Add new Student Successfull.");
        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    public void searchStudent() {
        String code = Utils.getStringreg("Enter code to search: ", "^S\\d{3}$",
                "Code cannot is empty", "Wrong code format");
        boolean check = true;
        for (Student stu : liststudent) {
            if (code.equalsIgnoreCase(stu.getCode())) {
                System.out.print("Student found: ");
                System.out.println(stu);
                check = false;
            }
        }
        if (check) {
            System.out.println("Student not found.");
        }
        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    public void updateStudent() {
        String code = Utils.getStringreg("Enter code to update: ", "^S\\d{3}$",
                "Code cannot is empty", "Wrong code format");
        String name;
        double mark;
        boolean check = true;
        for (Student stu : liststudent) {
            if (code.equalsIgnoreCase(stu.getCode())) {
                name = Utils.getString("Enter Fullname: ", "Fullname cannot is empty");
                stu.setName(name);
                mark = Utils.getDouble("Enter Mark: ", 0, 10);
                stu.setMark(mark);
                System.out.println("Student details updated.");
                check = false;
            }
        }
        if (check) {
            System.out.println("Student not found.");
        }
        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    public void removeStudent() {
        String code = Utils.getStringreg("Enter code to remove: ", "^S\\d{3}$",
                "Code cannot is empty", "Wrong code format");
        boolean check = true;
        for (int i = 0; i < liststudent.size(); i++) {
            if (code.equalsIgnoreCase(liststudent.get(i).getCode())) {
                liststudent.remove(i);
                System.out.println("Student has been deleted.");
                check = false;
            }
        }
        if (check) {
            System.out.println("Student not found.");
        }
        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    public void listAllStudent() {
        System.out.println("List Students: ");
        for (Student stu : liststudent) {
            System.out.println(stu);
        }
    }

    public boolean checkCode(String code) {
        for (Student stu : liststudent) {
            if (code.equals(stu.getCode())) {
                return true;
            }
        }
        return false;
    }
}

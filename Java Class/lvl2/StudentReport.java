class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String grade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        return "F";
    }

    void show() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        System.out.println(grade());
    }

    public static void main(String[] args) {
        Student s = new Student("Rishi", 1, 88);
        s.show();
    }
}

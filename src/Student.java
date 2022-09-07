public class Student {
    private String name;
    private int rollNo;
    private int totalMarks;

    public Student(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", totalMarks=" + totalMarks +
                '}';
    }
}

public class Students {
    public String name;
    public int grade;
    public Students(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
     return name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Имя: " + name + ", оценка: " + grade);
    }
}

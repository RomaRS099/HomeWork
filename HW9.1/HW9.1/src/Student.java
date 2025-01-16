public class Student {
    private int id;
    private String name;
    private int ageStudy;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
        this.ageStudy = 1;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getAgeStudy() {
        return ageStudy;
    }

    public void incrementAgeStudy() {
        ageStudy++;
    }
}


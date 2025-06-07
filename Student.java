import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private ArrayList<Grade> grades;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade g) {
        grades.add(g);
    }

    public double calculateAverage() {
        if (grades.isEmpty())
            return 0;
        double sum = 0;
        for (Grade g : grades) {
            sum += g.getScore();
        }
        return sum / grades.size();
    }

    
    public void display(){
        System.out.println(id +"-"+ name + " " + calculateAverage());
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }

}

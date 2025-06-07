import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // create some course
        Course math = new Course("m101", "Math");
        Course english = new Course("E101", "English");

        // create a sudent
        Student student1 = new Student("S001", "Raphael");

        // assighe grade
        student1.addGrade(new Grade(english, 50));
        student1.addGrade(new Grade(math, 50));
        student1.display();
    }
}
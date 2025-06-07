public class Grade {
    private Course course;
    private double score;

    public Grade(Course course, double score) {
        this.course = course;
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public double getScore() {
        return score;
    }
    @Override
    public String toString(){
        return course.getCourseName() + " - " + score;
    }
}

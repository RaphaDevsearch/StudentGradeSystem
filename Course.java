public class Course {
    private String courseId;
    private String courseName;

    public Course(String id, String name) {
        this.courseId = id;
        this.courseName = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
    
    @Override
    public String toString(){
        return courseId + " - " + courseName;
    }
}

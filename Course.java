public class Course {

    String name;
    String instructor;
    int number;

    Course(String courseName, String courseInstructor, int numberStudent) {
        name = courseName;
        instructor = courseInstructor;
        number = numberStudent;

    }

    public String getCourseName() {
        return name;
    }

    public void setCourseName(String newCourse) {
        name = newCourse;
    }

    public String getCourseIstructor() {
        return instructor;
    }

    public void setCourseInstructor(String newInstructor) {
        instructor = newInstructor;
    }

    public int getNumberStudent() {
        return number;
    }

    public void setNumberStudent(int numStudent) {
        number = numStudent;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Course name: " + name + " Instructor Name: " + instructor + " Number of Enrolled Students: " + number;
    }

    public static void main(String[] args) {
        Course java = new Course("Java", "Salwa", 20);
        System.out.println(java);

    }
}

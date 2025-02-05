import java.io.Serializable;

public class Enrollment implements Serializable{
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate){
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    
    public void setCourse(Course course){
        this.course = course;
    }

    public void setEnrollmentDate(String enrollmentDate){
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent(Student student){
        return student;
    }

    public Course getCourse(Course course){
        return course;
    }

    public String getEnrollmentDate(String enrollmentDate){
        return enrollmentDate;
    }

    @Override
    public String toString() {
        return "Opiskelija: " + student.getName() +
                ", OpNumero: " + student.getID() +
                ", Ikä: " + student.getAge() +
                ", Kurssin nimi: " + course.getCourseName() +
                ", Kurssin koodi: " + course.getCourseCode() +
                ", Opettajana: " + course.getInstructor() +
                ", Ilmoittautui: " + enrollmentDate;
    }


}

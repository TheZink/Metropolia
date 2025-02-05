import java.io.Serializable;

public class Course implements Serializable{
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public void setCourseCode(String code){ 
        courseCode = code; 
    }

    public void setCourseName(String name) { 
        courseName = name; 
    };

    public void setInstructor(String name){ 
        instructor = name; 
    }

    public String getCourseCode() { 
        return courseCode; 
    }

    public String getCourseName() { 
        return courseName; 
    }

    public String getInstructor() { 
        return instructor; 
    }
}

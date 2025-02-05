import java.io.Serializable;

public class Student implements Serializable{
    private int studentID;
    private String studentName;
    private int studentAge;

     public Student(int studentID, String studentName, int studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
     }

     public void setID(int ID) { 
        studentID = ID; 
    }

     public void setName(String name) { 
        studentName = name; 
    }

     public void setAge(int age) { 
        studentAge = age; 
    }

     public int getID() { 
        return studentID; 
    }

     public String getName() { 
        return studentName; 
    }

     public int getAge() { 
        return studentAge; 
    }
}

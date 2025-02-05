import java.io.*;

public class Main {
    private final static String FILENAME = "student.ser";
    public static void main(String[] args) {
        Student student = new Student(1,"Matti",25);
        Course course = new Course("131","Java","Jukka");

        File f = new File(FILENAME);
        Enrollment enrollment;

        // Jos tiedosto on olemassa, luetaan se ja tulostetaan
        if (f.exists() && f.isFile()) {
            try (
                FileInputStream inputStream = new FileInputStream(FILENAME); 
                ObjectInputStream object = new ObjectInputStream(inputStream);
            ) {
                enrollment = (Enrollment) object.readObject();
                System.out.println(enrollment);
            } catch (Exception e) {
                System.err.println(e);
            }
            
        } else {

            // Muuten luodaan tiedosto
            enrollment = new Enrollment(student,course,"Tänään");

            try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME); 
                ObjectOutputStream object = new ObjectOutputStream(outputStream);
            ) {
                object.writeObject(enrollment);
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}

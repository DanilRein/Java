
//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 2
import java.util.ArrayList;

public class Course {

    private String courseName;
    private Student student;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    ArrayList<String> courseList = new ArrayList<String>();
    ArrayList<Double> courseListTest = new ArrayList<Double>();

    public void addStudent(Student newStudent) {
        this.student = newStudent;
        courseList.add(student.toString());
        courseListTest.add(student.average());
    }

    public double courseAverage() {
        double result = 0;
        for (int i = 0; i < courseListTest.size(); i++)
            result +=courseListTest.get(i);
        return result / courseListTest.size();
    }

    public void roll() {
        System.out.println("\nName of the course: \""+courseName+"\"\nStudents:\n");
        for (int j = 0; j < courseList.size(); j++)
            System.out.println(courseList.get(j) + "\n");

    }
}

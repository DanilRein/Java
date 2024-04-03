//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 2
public class CourseBody {
    public static void main(String[] args) {

        Course mathCourse = new Course("Introduction to Programming");

        Address bHome = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
        Address dHome = new Address("Pushkina ave", "Minsk", "Minsk", 220093);
        Address aHome = new Address("Bobruiskaya str", "Bobruisk", "Bobruisk", 212393);
        Address school = new Address("21 Jump Street", "Blacksburg", "VA", 24551);
        Student Bob = new Student("Robert", "Smith", bHome, school, 5, 3, 4);
        Student Anton = new Student("Anton", "Nazarenko", aHome, school, 4, 3, 0);
        Student Daniel = new Student("Daniil", "Radevich", dHome, school, 5, 5, 5);

        mathCourse.addStudent(Bob);
        mathCourse.addStudent(Daniel);
        mathCourse.addStudent(Anton);

        mathCourse.roll();

        System.out.println("Average score of the course: " + mathCourse.courseAverage());
    }
}

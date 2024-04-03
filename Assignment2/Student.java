//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 2
public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private double[] test = { 0, 0, 0 };

    public Student() {
        this.test[0] = 0;
        this.test[1] = 0;
        this.test[2] = 0;
    }

    public Student(String first, String last, Address home,
            Address school, double test1, double test2, double test3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.test[0] = test1;
        this.test[1] = test2;
        this.test[2] = test3;
    }

    public void setTestScore(int testNum, double testScore) {
        this.test[testNum - 1] = testScore;
    }

    public double getTestScore(int testNum) {
        return test[testNum - 1];
    }

    public double average() {
        return (test[0] + test[1] + test[2]) / 3;
    }
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress + "\n";
        for (int i = 0; i < this.test.length; i++)
            result += "(" + (i + 1) + ")Test" + " score: " + test[i] + "\n";
        result += "Average test score: " + average();
        return result;
    }
}

//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 2
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int personAge) {
        this.age = personAge;
    }

    public int dogAge() {
        return age * 7;
    }

    public String toString() {
        return "Dogs Name: " + name + ";\tDog age in general years: " + age;
    }
}

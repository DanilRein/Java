//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 2
public class Kennel {
    public static void main(String[] args) {
        Dog dog = new Dog("Kennel", 12);

        System.out.println("Dogs name: " + dog.getName() + ";\tDogs age in \"dogs years\": " + dog.dogAge());
        System.out.println(dog);

        dog.setName("Robert");
        dog.setAge(2);// updating the information

        System.out.println("Updated information:");

        System.out.println("Dogs name: " + dog.getName() + ";\tDogs age in \"dogs years\": " + dog.dogAge());
        System.out.println(dog);
    }
}

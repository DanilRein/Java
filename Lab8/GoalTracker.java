//Lab 8, Problem 1, driver
public class GoalTracker {
    public static void main(String[] args) {

        NumberOfGoals numOfGoals = new NumberOfGoals();

        System.out.println("Score at the beginning: " + numOfGoals.getGoal());

        numOfGoals.setGoal();
        numOfGoals.setGoal();
        System.out.println("Score after two goals: " + numOfGoals.getGoal());

    }

}
// student: Daniil Radevich
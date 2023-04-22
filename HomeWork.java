import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Расскажите о вашем друге. \nКак зовут вашего друга? " );

        Scanner inputName = new Scanner(System.in);
        String nameString = inputName.nextLine();

        System.out.println("Сколько лет вашему другу?");

        Scanner inputAge = new Scanner(System.in);
        int ageFriend = inputAge.nextInt();

        System.out.println("Моему другу " + nameString + " на данный момент " + ageFriend + " лет.");
    }
}

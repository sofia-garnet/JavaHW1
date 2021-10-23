import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = null, lastName = null;
        try {
            System.out.println("Please enter your first name.\nFirst name:");
            firstName = reader.readLine();
            System.out.println("Please enter your last name.\nLast name:");
            lastName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //печатает ваше имя и фамилию
        System.out.println(String.format("Your full name is %s", firstName.concat(" " + lastName)));

        //добавить условие,
        // если длина вашего имени больше 7 символов - вывести в консоль “more than 7”, если меньше - ”less than 7”
        System.out.println(firstName.length() > 7 ? "more than 7" : "less than 7");

        //задан шаг 0 - 10 и значение 5,вывести в консоль на каждом шагу информацию о шаге и о значении,
        // с каждым шагом значение увеличивается на 2
        for (int i = 0, j = 5; i < 11; i++, j += 2) {
            System.out.println(String.format("Шаг %s, значение :%s", i, j));
        }
    }
}

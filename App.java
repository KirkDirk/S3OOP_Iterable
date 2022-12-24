import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        Personal personal = new Personal();
        personal.addUser(new User("Ostap", "Bender", 33))
                .addUser(new User("Alla", "PiplEat", 28))
                .addUser(new User("Father", "RussianDemocration", 55))
                .addUser(new User("Pastor", "Fedor", 60))
                .addUser(new User("Pastor", "Fedor", 33));

        User boss = new User(personal, "Iliya", "Ilf", 47);
        
        Personal personal2 = new Personal();
        personal2.addUser(new User("madam", "Grizazueva", 44));

        User boss2 = new User(personal2, "Evgeny", "Petrov", 46);
        personal.addUser(boss2);

        for (User item : personal) {
            System.out.println(item);
        }
        System.out.println();

        Collections.sort(personal.getUsers());

        personal.forEach(System.out::println);
        System.out.println();


        Company company = new Company(boss);
        for (User item : company) {
            System.out.println(item);
        }
    }
}

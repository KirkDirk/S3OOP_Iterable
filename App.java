public class App {
    public static void main(String[] args) throws Exception {
        
        Personal personal = new Personal();
        personal.addUser(new User("Ostap", "Bender", 33))
                .addUser(new User("Alla", "PiplEat", 28))
                .addUser(new User("Father", "RussianDemocration", 55))
                .addUser(new User("Pastor", "Shlag", 60));

        for (User item : personal) {
            System.out.println(item);
        }
                //personal.forEach(System.out::println);

    }
}
